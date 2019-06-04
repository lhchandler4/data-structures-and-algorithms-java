package Java.LinkedList;

import java.util.*;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
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
}