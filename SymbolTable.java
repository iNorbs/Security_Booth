package Security_Booth;
import java.util.LinkedList;

public class SymbolTable<Key extends Comparable<Key>, Value> {

    private Node first;

    private class Node {
        private Key key;
        private Value val;
        private Node next;

        public Node(Key key, Value val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    public SymbolTable() {
        this.first = null;
    }

    public Iterable<Key> keys() {
        //Returns all the keys
        LinkedList<Key> temp = new LinkedList<Key>();
        for (Node x = this.first; x != null; x = x.next) {
            temp.add(x.key);
        }
        return temp;
    }

    public void put(Key key, Value val) {
        if (key == null) throw new Error("Null Key error");
        if (val == null) {
            delete(key);
            return;
        }

        //updates the value if key already in ST
        for (Node x = this.first; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.val = val;
                return;
            }
        }
        //puts new key and val at the front of the ST
        this.first = new Node(key, val, this.first);
    }

    public void delete(Key key) {
        if (key == null) throw new Error("Null Key error");
        this.first = delete(this.first, key);
    }

    private Node delete(Node x, Key key) {
        if (x == null) return null;
        if (key.equals(x.key)) return x.next;
        x.next = delete(x.next, key);
        return x;
    }

    public Value get(Key key) {
        //Gets the value corresponding to the correct key
        for (Node x = this.first; x != null; x = x.next) {
            if (x.key.equals(key)) return x.val;
        }
        return null; //key not found
    }
}
