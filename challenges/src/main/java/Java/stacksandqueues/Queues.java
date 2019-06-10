package Java.stacksandqueues;

public class Queues {
    private Node front;
    private Node last;
    private int size;

    public void Queue(){
        this.front = null;
        this.last = null;
        this.size = 0;
    }
    public int getSize() {
        return size;
    }

    public boolean nothingHere(){
        return front == null;
    }

    public Node getFront() {
        return front;
    }

    //methods
    public int peek(){
        if(nothingHere() == true){
            System.out.println("The queue seems to be empty");
        }
        return front.data;
    }

    public int dequeue(){
        if(nothingHere() == true){
            System.out.println("The queue seems to be empty");
        }
        int data = front.data;
        front = front.next;
        size--;
        return data;
    }

    public void enqueue(int data){
        Node q = new Node(data);
        if(nothingHere() == true){
            front = q;
            last = q;
            size++;
        } else {
            last.next = q;
            last = q;
            size++;
        }
    }
}

