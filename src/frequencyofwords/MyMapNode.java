package frequencyofwords;
import java.util.LinkedList;

public class MyMapNode<K, V> {
    K key;
    V value;
    LinkedList<MyMapNode<K, V>> next;

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = new LinkedList<>();
    }
}
