import java.util.Random;

/**
 * 073�ŗp���錻�ݓ����擾�R�}���h.
 *
 * @author jsfkdt
 */
public class RandomIntegerCommand extends AbstractCommand {
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer executeInner() {
        Random randomInteger = new Random();
        int number = 3/0; // ArithmeticException�𔭐�������.
        return new Integer(randomInteger.nextInt());
    }
}