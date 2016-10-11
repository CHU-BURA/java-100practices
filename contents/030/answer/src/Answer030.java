import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
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
            try (ObjectOutputStream outputObject = new ObjectOutputStream(outputFile)) {
                
                // �V���A���C�Y�Ώۂ̃N���X�̏�������
                outputObject.writeObject(new ForSerializeClass());
                
            } catch (IOException e) {
                // ���o�̓G���[.
                e.printStackTrace();
            }
            
        } catch (IOException e) {
            // ���o�̓G���[.
            e.printStackTrace();
        }
        
        // �t�@�C�����f�V���A���C�Y���A�C���X�^���X�ϐ���W���o��.
        try (FileInputStream inputFile = new FileInputStream("Sample.txt")) {
            
            // ���̓I�u�W�F�N�g�̐���.
            try (ObjectInputStream inputObject = new ObjectInputStream(inputFile)) {
                
                // �I�u�W�F�N�g�̓ǂݍ���.
                ForSerializeClass serializeClass = (ForSerializeClass)inputObject.readObject();
                
                // �I�u�W�F�N�g�̃C���X�^���X�ϐ��ɒl��ݒ肷��.
                serializeClass.setIntInstance(100);
                serializeClass.setStringInstance("Answer030");
                
                // �ǂݍ��񂾃I�u�W�F�N�g�̃C���X�^���X�ϐ���W���o��.
                System.out.println(serializeClass.intInstance);
                System.out.println(serializeClass.stringInstance);
                
            } catch (IOException  e) {
                e.printStackTrace();
            }
            
        } catch (IOException  e) {
            // ���o�̓G���[.
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // �N���X�����݂��Ȃ�.
            e.printStackTrace();
        }
    }
}
