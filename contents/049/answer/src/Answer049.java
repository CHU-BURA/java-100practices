import java.util.Date;

/**
 * 049�̉𓚂ł��B
 *
 * @author jsfkdt
 */
public class Answer049 {
    /* Date�^�ϐ�. */
    private Date day;
    
    /**
     * Date�^�ϐ��Ɋi�[����.
     *
     * @param day Date�^�ϐ�
     */
    Answer049 (Date day) {
        this.day = day;
    }
    
    /**
     * 049�̉𓚂ł�.
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args) {
        // ���݂̓��t���i�[���AAnswer049�I�u�W�F�N�g�𐶐�.
        final Answer049 answer049 = new Answer049(new Date());
        
        // ���ݓ��t����}1���̃����_���ȓ������擾.
        final Date randomDate = new DateUtil().randomDayAndTime();
        
        // �擾����������W���o��.
        System.out.println(randomDate);
    }
}
