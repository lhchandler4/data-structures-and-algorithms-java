package Java.LinkedList;

import java.util.*;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public Node getTheHead() {
        return this.head;
    }

    //Append a value to the end of a Linked List
    public Node append(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            return newNode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return newNode;
    }

    //Insert a value at the head of the Linked List
    public void insert(int data) {
        Node newHead = new Node(data);
        newHead.next = this.head;
        this.head = newHead;
    }

    //Includes: If the Linked List includes the inputted value
    public boolean includes(int x) {
        Node current = this.head;
        while (current != null) {
            if (current.data == x)
                return true;
            current = current.next;
        }
        return false;
    }

    //Print the Linked List's Values
    @Override public String toString() {
        Node current = this.head;
        String answer = "";
        while (current != null) {
            answer += current.data + ", ";
            current = current.next;
            if(current == null){
                answer += "null";
            }
        }
        return answer;
    }

    //Print the Linked List's Values
    public String prints() {
        Node current = this.head;
        String answer = "";
        while (current != null) {
            answer += current.data + ", ";
            current = current.next;
            if(current == null){
                answer += "null";
            }
        }
        return answer;
    }

    //Insert Before (illegal argument exception)
    public void insertBefore(int x, int data) {
        Node current = this.head;
        Node prev = null;
        if (head != null) {
            while (current != null) {
                if (current.data == x) {
                    Node n = new Node(data);
                    n.next = current;
                    if (prev != null) {
                        prev.next = n;
                    }
                    if(head.data == x){
                        this.head = n;
                    }
                    return;
                }
                prev = current;
                current = current.next;
            }
        }
    }

    //Insert After (illegal argument exception)
    public void insertAfter(int x, int data) {
        Node current = this.head;
        if (head != null) {
            while (current != null) {
                if (current.data == x) {
                    Node n = new Node(data);
                    n.next = current.next;
                    current.next = n;
                    return;
                } else {
                    current = current.next;
                }

            }
        }
    }

    //
    public boolean nothingIsThereBro(){
        if(head == null){
            return true;
        } else {
            return false;
        }
    }

    //Insert at n position from the end
    public int returnNfromTheEnd(int k){
        Node current = head;
        if (k < 0){
            throw new IllegalArgumentException("k must be postitive");
        }
        if(nothingIsThereBro()){
            throw new NullPointerException("nothing in the linked list");
        } else {
            int counter = 0;
            while(current != null){
                counter++;
                current = current.next;
            }
            current = head;
            for(int i = 0; i < counter - k - 1; i++){
                current = current.next;
            }
            return current.data;
        }
    }

    //Merge two linked lists

    public static LinkedList mergeLists(LinkedList ll1, LinkedList ll2){
        Node llOneCurr = ll1.getTheHead();
        Node llTwoCurr = ll2.getTheHead();
        Node temporaryOne;
        Node temporaryTwo;
        ////If either list is empty
        if (llOneCurr == null) return ll2;
        if (llTwoCurr == null) return ll1;
        //loop to reassign pointers
        while (true) {
            //true is the same thing as saying != null
            temporaryOne = llOneCurr.next;
            temporaryTwo = llTwoCurr.next;
            llOneCurr.next = llTwoCurr;
            llOneCurr = temporaryOne;
            if (llOneCurr == null) break;
            llTwoCurr.next = llOneCurr;
            llTwoCurr = temporaryTwo;
            if (llTwoCurr == null) break;
        }
        return ll1;
    }


}