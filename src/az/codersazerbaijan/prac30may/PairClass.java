package az.codersazerbaijan.prac30may;

public class PairClass<K,V> implements Pair<K,V>{
public K key;
public V value;

    public PairClass(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }


}
