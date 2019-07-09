package Java.hashtable;

class Node<T> {
    public String key;
    public T value;
    public Node next;

    public Node(String key, T value) {
        this.setKey(key);
        this.setValue(value);
        this.setNext(null);
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}