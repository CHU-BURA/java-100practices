import java.util.Date;
import java.util.Random;
import java.util.Calendar;

/**
 * 049�Ŏg�p���郆�[�e�B���e�B�N���X.
 *
 * @author jsfkdt
 */
public final class DateUtil {
    
    /**
     * ���ݎ�������v���X�}�C�i�X1���͈̔͂Ń����_���ȓ���������.
     *
     * @return ���ݎ�������v���X�}�C�i�X1���̃����_����Date�^����
     */    
    public final Date randomDayAndTime() {
        // Date�^�̓���.
        Date randomDate = new Date();
        
        // �����̓���.
        Calendar oneAfterDay = Calendar.getInstance();
        oneAfterDay.add(Calendar.DATE, 1);
        
        // ����O�̓���.
        Calendar oneBeforeDay = Calendar.getInstance();
        oneBeforeDay.add(Calendar.DATE, -1);
        
        // �~���b�̍����擾.
        final long timeDiff = oneAfterDay.getTimeInMillis() - oneBeforeDay.getTimeInMillis();
        
        // �~�����̒l�������_���Ŏw��.
        final int random = new Random().nextInt((int)timeDiff + 1);
        
        // �����_���ȔN�����̐���.
        oneAfterDay.add(oneAfterDay.MILLISECOND, -random);
        
        // Calendar�^��Date�^�֕ϊ�.
        randomDate = oneAfterDay.getTime();
        
        return randomDate;
    }
}