import java.util.Locale;
import java.util.ResourceBundle;
import java.text.MessageFormat;
import java.util.MissingResourceException;

/**
 * 038�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer038 {
    
    /**
     * 038�̉𓚂ł�.
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args) {
        
        // �z��ɒl�������Ă��Ȃ��ꍇ�A�����I��.
        if (args.length < 1 ) {
            System.err.println("�����ɒu���㕶�������͂��A�Ď��s���Ă��������B");
            System.exit(1);
        }
        
        /* �ϊ��㕶������擾. */
        final String afterWord = args[0];
        
        /* ���\�[�X�t�@�C��. */
        final ResourceBundle resouce;
        
        /* �t�@�C������ݒ�. */
        final String fileName = "output";
        
        
        try {
            // ���P�[�������{�̏ꍇ.
            if ("JP".equals(Locale.getDefault().getCountry())) {
                resouce = ResourceBundle.getBundle(fileName, Locale.JAPAN);
            } else {
                //���P�[�������{�ȊO�̏ꍇ.
                resouce = ResourceBundle.getBundle(fileName, Locale.US);
            }
            
            // �������u�����A�W���o��.
            System.out.println(java.text.MessageFormat.format(resouce.getString("sentence"), afterWord));
        
        } catch (MissingResourceException e) {
            e.printStackTrace();
        }
    }
}