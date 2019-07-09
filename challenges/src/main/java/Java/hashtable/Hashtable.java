package Java.hashtable;

import static java.lang.StrictMath.abs;

public class Hashtable<T> {

    Node<T>[] hashbuckets;

    public Hashtable(){
        this.hashbuckets = new Node[1024];
    }

    public Hashtable(int numOfNodes){
        this.hashbuckets = new Node[numOfNodes];
    }


    public void add(String key, T value){
        int hashedKey = hash(key);
        Node node = new Node(key, value);
        if (hashbuckets[hashedKey] == null){
            hashbuckets[hashedKey] = node;
        } else {
            node.setNext(hashbuckets[hashedKey]);
            hashbuckets[hashedKey] = node;
        }
    }

    public Object get(String key){
        int i = hash(key);
        if (hashbuckets[i] == null) return null;
        else if (hashbuckets[i].next == null) return hashbuckets[i].value;
        else {
            Node current = hashbuckets[i];
            while (current != null){
                if (current.key == key){
                    return current.value;
                }
                current = current.next;
            }
        }
        return null;
    }

    public Boolean contains(String key){
        if ( this.get(key) != null) return true;
        return false;
    }

    protected int hash(String key){
        return abs((key.hashCode() * 599 ) % hashbuckets.length);
    }
}
