import java.util.Date;
/**
 * 073�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer073 {
    /**
     * 073�̉𓚂ł�.
     *
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args){
        // Date�R�}���h�����s
        Command date = CommandFactory.getInstance().createCurrentCommand();
        System.out.println("Date�R�}���h�̎��s");
        System.out.println("���s�O�X�e�[�^�X�F" + date.getStatus());
        date.execute();
        System.out.println("���s��X�e�[�^�X�F" + date.getStatus());
        System.out.println("���s���ʁF" + date.getResult());
        System.out.println("��O�F" + date.getException());
        System.out.println();
        
        // Random�R�}���h�����s
        Command num = CommandFactory.getInstance().createRandomIntegerCommand();
        System.out.println("Random�R�}���h�̎��s");
        System.out.println("���s�O�X�e�[�^�X�F" + num.getStatus());
        num.execute();
        System.out.println("���s��X�e�[�^�X�F" + num.getStatus());
        System.out.println("���s���ʁF" + num.getResult());
        System.out.println("��O�F" + num.getException());
        
    
    }
}