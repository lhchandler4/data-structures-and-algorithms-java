package Java.queueWithStacks;

import Java.stacksandqueues.Stacks;

public class PseudoQueue {
        Stacks stackUno;
        Stacks stackDos;

        public PseudoQueue() {
            this.stackUno = new Stacks();
            this.stackDos = new Stacks();
        }

        public int dequeue() {
           while(stackUno.nothingHere()){
               stackDos.push(stackUno.pop());
           } int answer = (stackDos.pop());
           while(stackDos.nothingHere()){
               stackUno.push(stackDos.pop());
           }return answer;
        }

        public void enqueue(int data) {
            stackUno.push(data);
        }

    }
