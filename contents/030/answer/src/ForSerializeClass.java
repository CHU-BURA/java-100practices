import java.io.Serializable;
/**
 * 030�p�̃C���X�^���X�ϐ������N���X�ł�.
 *
 * @author jsfkdt
 */
class ForSerializeClass implements Serializable {
    /* int�^�̃C���X�^���X�ϐ� */
    int intInstance = 1;
    /* String�^�̃C���X�^���X�ϐ� */
    String stringInstance = "Answer30";
    
    public void setIntInstance(int intInstance) {
        this.intInstance = intInstance;
    }
    
    public void setStringInstance(String stringInstance) {
        this.stringInstance = stringInstance;
    }
}