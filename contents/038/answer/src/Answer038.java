import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Properties;
import java.util.Map.Entry;
import java.util.Map;
import java.util.HashMap;
import java.util.Locale;
/**
 * 038�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer038 {
    /**
     * 038�̉𓚂ł�.
     * ���P�[�����擾���A���P�[���ɍ��v����v���p�e�B�t�@�C����ǂݍ��݂܂�.
     * �ǂݍ��񂾃t�@�C���Ɏw�肳�ꂽ�L�[�ƒl���擾���A
     * ���̒l�̒�����"x"��T���A�R�}���h���C�������Ŏw�肵���l�Œu�����܂��B
     * �����Ēu����̕��͂�W���o�͂��܂��B
     *
     * @param arguments
     */
    public static void main(final String[] args) {
        
        // �z��ɒl�������Ă��Ȃ��ꍇ�A�����I��.
        if (args.length < 1 ) {
            System.err.println("�����ɒu���㕶�������͂��A�Ď��s���Ă��������B");
            System.exit(1);
        }
        /* �ϊ��㕶������擾 */
        String afterWord = args[0];
        
        /* ���P�[���̎擾. */
        String country = getLocale();
        
        /* ���P�[�������ɁA�v���p�e�B�t�@�C����path���擾. */
        final String propertiesFileName = findPropertiesFile(country) + "Map.properties";
        
        /* �v���p�e�B�t�@�C����ǂݍ��񂾃}�b�v���擾. */
        Map propertiesMap = propertiesToMap(propertiesFileName);
        
        /* key�ɑΉ�����l��String�^�Ŏ擾. */
        String beforeSentence = propertiesMap.get(findPropertiesFile(country)).toString();
        
        /* �ϊ��O�̕��͂�W���o��. */
        System.out.println(beforeSentence);
        
        /* �ϊ���̕��͂��擾. */
        String afterSentence = convertSentence(beforeSentence, afterWord);
        
        /* �ϊ���̕��͂�W���o��. */
        System.out.println(afterSentence);
    }
    
    /**
     * �X�P�[�����擾���A������ԋp����.
     *
     * @return ����
     */
    public static String getLocale() {
        /* ���݂̃��P�[�����擾. */
        Locale location = Locale.getDefault();
        
        /* �������擾. */
        String country = location.getCountry();
        
        return country;
    }
    
    /**
     * �v���p�e�B�t�@�C�����̐ړ����ԋp����.
     *
     * @return �t�@�C����
     */
    public static String findPropertiesFile(String country) {
        if("JP".equals(country)) {
            // ���{��t�@�C��
            return "Japanese";
        } else {
            // �p��t�@�C��
            return "English";
        }
    }
    
    /**
     * �v���p�e�B�t�@�C������}�b�v���擾���A���ʂ�ԋp����.
     *
     * @param propertiesFileName �Ώۂ̃v���p�e�B�t�@�C��
     * @return �v���p�e�B�t�@�C���̃}�b�v
     */
    @SuppressWarnings("unchecked")
    public static Map propertiesToMap(String propertiesFileName) {
        
        Map propertiesMap = new HashMap();
        Properties property = new Properties();
        // �v���p�e�B�t�@�C�������[�h.
        try {
            property.load(new FileInputStream(propertiesFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // �v���p�e�B�t�@�C�����e���}�b�v�ɓo�^.
        for (Entry<Object, Object> e : property.entrySet()) {
            propertiesMap.put(e.getKey(), e.getValue());
        }
        
        return propertiesMap;
    }
    
    /**
     * �ϊ���̕W���o�͗p�������ԋp����.
     *
     * @param beforeSentence �ϊ��O�̕�����
     * @param afterWord �ϊ���L�[���[�h
     * @return �ϊ���̕�����
     */
    public static String convertSentence(String beforeSentence, String afterWord) {
        /* x�ɓ�����ӏ�. */
        String regex = "x";
        
        // �w��̐��K�\�����p�^�[���ɃR���p�C������.
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(beforeSentence);
        
        /* �ϊ���̕���. */
        String afterSentence = m.replaceFirst(afterWord);
        
        return afterSentence;
    }
}