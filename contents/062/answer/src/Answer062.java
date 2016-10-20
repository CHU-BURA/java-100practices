import java.util.Map;
import java.util.Collections;

/**
 * 062�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer062 {
    /* �C�ӂ̃f�[�^���i�[�\�ȃL�[�o�����[�`����Map.(1) */
    private Map<String, String> cacheMap = null;
    
    /**
     * LinkedHashMap�N���X�𐶐����AMap���쐬����.
     */
    @SuppressWarnings("unchecked")
    Answer062() {
        /* �o�^�ł���L�[�̐����ő�100�̃}�b�v�C���X�^���X�𐶐�.(2) */
        /* �X���b�h�Z�[�t��Map�̂��߁A�C�ӂ̃^�C�~���O�Ńf�[�^�̑}���E�擾�\.(3) */
        this.cacheMap = Collections.synchronizedMap(new LruHashMap(100));
    }
    /**
     * 062�̉𓚂ł�.
     * 
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args) {
        Answer062 answer =  new Answer062();
        
        // �f�[�^���i�[.
        answer.cacheMap.put("key111", "value111");
        answer.cacheMap.put("key222", "value222");
        answer.cacheMap.put("key333", "value333");
        
        // ���ɑ��݂���key�̏ꍇ�͏㏑������.
        answer.cacheMap.put("key111", "value1111");
        displayAllElements(answer.cacheMap);
        
        /* �f�[�^�̎擾�\.(3) */
        System.out.println(answer.cacheMap.get("key333") + "\n");
        
        /* �f�[�^�̑}���\. (4) */
        answer.cacheMap.put("key444", "value444");
        answer.cacheMap.put("key555", "value555");
        answer.cacheMap.put("key666", "value666");
        
        /* ���ꂽ�f�[�^�͏����Ȃ�. ��Ɏc�葱����.(6),(7) */
        displayAllElements(answer.cacheMap);
        
        /* �����f�[�^�����x���擾�\.(7) */
        System.out.println(answer.cacheMap.get("key333"));
    }
    
    /**
     * �S�Ă�key,Value�̑g�ݍ��킹��W���o�͂���.
     * map�Ɋi�[����Ă���l���Ȃ��ꍇ�́A�����\�����Ȃ�.
     * 
     * @param map cacheMap
     */
    public static void displayAllElements(Map<String, String> map) {
        
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        System.out.println("");
    }
}

