import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 062��LinkedHashMap�p�N���X�ł�.
 *
 * @author jsfkdt
 */
public class LruHashMap<K, V> extends LinkedHashMap<K, V> {
    /* �ő�e��. */
    private final int maxSize;
    
    /**
     * LRU�����p�ɐݒ肷��.
     * MaxSize��ݒ肷��.
     */
    public LruHashMap(int maxSize) {
        /* true�ɂ��邱�ƂŁAMap�ōł��Q�Ƃ���Ă��Ȃ����̂��폜�����.(5) */
        super(15, 0.75f, true);
        this.maxSize = maxSize;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        /* Map�̃T�C�Y��max�ł���΁A�ł��Q�Ƃ���Ă��Ȃ����̂��폜.(5) */
        return size() > maxSize;
    }
}
