import java.util.Random;

/**
 * 035�ŗp����X���b�hB�̎��s�N���X�ł�.
 *
 * @author jsfkdt
 */
public class ThreadRequestB implements Runnable {
    /* �A�N�e�B�u�X���b�h�� */
    static int activeThreadCount = 0;
    
    /**
     * �X���b�hB�����s����.
     */
    public ThreadRequestB() {
    }
    
    /**
     * 1�`5�b�̃����_���Ȏ��Ԃ����X���[�v���s���X���b�h�����s����.
     */
    @Override
    public void run() {
        // �A�N�e�B�u�X���b�h�����C���N�������g����.
        activeThreadCount++;
        
        //Random�N���X�̃C���X�^���X��.
        Random random = new Random();
        
        // 1�`5�̃����_���Ȓl���擾.
        int rand = random.nextInt(5) + 1;
        
        // �ΏۃX���b�h�̃E�G�C�g���Ԃ��w��.
        int sleepTime = rand * 1000;
        
        try{
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // �A�N�e�B�u�X���b�h�����f�N�������g����.
        activeThreadCount--;
    }
}
