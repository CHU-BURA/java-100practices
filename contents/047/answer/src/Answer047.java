import java.util.Date;

/**
 * 047�̉𓚂ł��B
 *
 * @author jsfkdt
 */
public class Answer047 {
    /* Date�^�ϐ�. */
    private Date day;
    
    /**
     * Date�^�ϐ��Ɋi�[����.
     *
     * @param day Date�^�ϐ�
     */
    Answer047 (Date day) {
        this.day = day;
    }
    
    /**
     * 047�̉𓚂ł�.
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args) {
        // ���݂̓��t���i�[���AAnswer047�I�u�W�F�N�g�𐶐�.
        final Answer047 answer047 = new Answer047(new Date());
        
        // ��߂�ꂽ�t�H�[�}�b�g��ԋp���郆�[�e�B���e�B���g�p.
        final String dayAndTime = new FormatUtil().dayAndTime(answer047.day);
        
        // ������W���o��.
        System.out.println(dayAndTime);
    }
}
