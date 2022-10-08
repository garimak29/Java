package HashMap;

import java.util.Objects;

public class MyEntry<K,V> {
    K key;
    V value;

    public void setValue(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyEntry<?, ?> myEntry = (MyEntry<?, ?>) o;
        return Objects.equals(key, myEntry.key) && Objects.equals(value, myEntry.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    MyEntry(K key , V value   ){
        this.key= key;
        this.value = value;

    }


}
