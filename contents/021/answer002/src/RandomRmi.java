import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 021�̉𓚂ł�. 0�`7�̔C�ӂ̐�����Ԃ��C���^�[�t�F�C�X.
 *
 * @author jsfkdt
 */
public interface RandomRmi extends Remote {
    int returnRandom() throws RemoteException;
}