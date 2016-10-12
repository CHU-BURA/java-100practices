import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

/**
 * 035�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer035 {
    private final ExecutorService executor;
    
    /**
     * ���s����X���b�h�����߂�.
     */
    Answer035(int poolSize) {
        this.executor = Executors.newFixedThreadPool(poolSize);
    }
    
    /**
     * �X���b�hA�����s����.
     */
    public void startThreadsA() {
        for (int i = 0; i < 100; i++) {
            // �X���b�hA�����s������.
            executor.execute(new ThreadRequestA());
        }
    }
    
    /**
     * �X���b�hB�����s����.
     */
    public void startThreadsB() {
        for (int i = 0; i < 100; i++) {
            executor.execute(new ThreadRequestB());
        }
    
    }
    /**
     * �V���b�g�_�E�����s��.
     */
    public void shutdownPool() {
        executor.shutdown();
    }
    
    /**
     * 035�̉𓚂ł�.
     * @param arguments �g�p���܂���.
     */
    public static void main(String[] args)  {
        
        Answer035 nh = new Answer035(200);
        
        // �X���b�hA�̎��s.
        nh.startThreadsA();
        
        // �X���b�hB�̎��s.
        nh.startThreadsB();
        
        // �A�N�e�B�u�ȃX���b�h���̕\��.
        for(int i = 0; i < 6; i++) {
            System.out.println("�X���b�hA �A�N�e�B�u�X���b�h���F" + ThreadRequestA.activeThreadCount + "��");
            System.out.println("�X���b�hB �A�N�e�B�u�X���b�h���F" + ThreadRequestB.activeThreadCount + "��");
            int beforeActiveThread = ThreadRequestA.activeThreadCount;
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // �X���b�h�̒�~.
        nh.shutdownPool();
    }
}