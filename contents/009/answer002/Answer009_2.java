import java.util.Properties;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 009�̉𓚂ł��B
 *
 * @author jsfkdt
 */
public class Answer009_2 {
    /**
     * 009�̉𓚂ł��B
     * @param arguments �g�p���܂���B
     */
    public static void main (String[] args) {

        Properties properties = new Properties();

        String file = args[0];
    	System.out.println("[ "+file+"��ǂݍ��񂾌���... ]");
        try {
            //�t�@�C����ǂݍ���
            InputStream inputStream = new FileInputStream(file);
            //�ǂݍ��񂾃t�@�C�����v���p�e�B�փ��[�h
            properties.load(inputStream);
            inputStream.close();

            //�l�̎擾
            System.out.println(properties.getProperty("id"));
            System.out.println(properties.getProperty("password"));
            System.out.println(properties.getProperty("place"));
            System.out.println(properties.getProperty("name"));
        	System.out.println();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
