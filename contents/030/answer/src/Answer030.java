import java.io.*;
/**
 * 030�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer030 {
    /**
     * 030�̉𓚂ł�.
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args) {
        
        // �N���X���V���A���C�Y���ăt�@�C���ɕۑ�.
        try (FileOutputStream outputFile = new FileOutputStream("Sample.txt")) {
            // �o�̓I�u�W�F�N�g�̐���.
            ObjectOutputStream outputObject = new ObjectOutputStream(outputFile);
            
            // �V���A���C�Y�Ώۂ̃N���X�̏�������
            outputObject.writeObject(new ForSerializeClass());
            
            // �I�u�W�F�N�g�o�̓X�g���[���̃N���[�Y.
            outputObject.close();
            
        } catch (IOException e) {
            // ���o�̓G���[.
            e.printStackTrace();
        }
        
        // �t�@�C�����f�V���A���C�Y���A�C���X�^���X�ϐ���W���o��.
        try (FileInputStream inputFile = new FileInputStream("Sample.txt")) {
            // ���̓I�u�W�F�N�g�̐���.
            ObjectInputStream inputObject = new ObjectInputStream(inputFile);
            
            // �I�u�W�F�N�g�̓ǂݍ���.
            ForSerializeClass serializeClass = (ForSerializeClass)inputObject.readObject();
            
            // �ǂݍ��񂾃I�u�W�F�N�g�̃C���X�^���X�ϐ���W���o��.
            System.out.println(serializeClass.intInstance);
            System.out.println(serializeClass.stringInstance);
            
            // �I�u�W�F�N�g���̓X�g���[���̃N���[�Y.
            inputObject.close();
            
        } catch (IOException  e) {
            // ���o�̓G���[.
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // �N���X�����݂��Ȃ�.
            e.printStackTrace();
        }
    }
}

/**
 * 030�p�̃C���X�^���X�ϐ������N���X�ł�.
 *
 * @author jsfkdt
 */
class ForSerializeClass implements Serializable {
    /* int�^�̃C���X�^���X�ϐ� */
    int intInstance = 100;
    /* String�^�̃C���X�^���X�ϐ� */
    String stringInstance = "Answer030";
}