package Java.stacksandqueues;

import java.util.EmptyStackException;

public class Stacks {
    private Node top;
    private int size;

    public Stacks(){
        top = null;
        size = 0;
    }

    public Node getTop() {
        return top;
    }

    public int getSize() {
        return size;
    }

    public boolean nothingHere(){
        return top == null;
    }

    //methods
    public int peek(){
        if(nothingHere() == true){
//            throw new EmptyStackException;
            System.out.println("The stack seems to be empty");
        }
        return top.data;
    }

    public int pop(){
        if(nothingHere() == true) {
//            throw new EmptyStackException()
            System.out.println("The stack seems to be empty");
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }


    public void push(int data){
        if(nothingHere() == true){
            top = new Node(data);
            size++;
        } else {
            Node topFromBefore = top;
            top = new Node(data);
            top.next = topFromBefore;
            size++;
        }
    }
}
