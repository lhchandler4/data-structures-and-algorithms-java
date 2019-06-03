package Java.LinkedList;

import java.util.*;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

// I just wanted to write this method because I saw it while watching a HackerRank YouTube video

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void insert(int data) {
        Node newHead = new Node(data);
        newHead.next = this.head;
        this.head = newHead;
    }

    public boolean includes(int x) {
        Node current = this.head;
        while (current != null) {
            if (current.data == x)
                return true;
            current = current.next;
        }
        return false;
    }

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

}