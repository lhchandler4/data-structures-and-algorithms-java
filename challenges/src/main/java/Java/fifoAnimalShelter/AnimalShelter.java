package Java.fifoAnimalShelter;
//first attempt I tried to do it with two different queues (one for dog and one for cat)
//need to make it generic with T type. Counter is for testing
public class AnimalShelter <T> {
    private Node<T> theFront;
    private Node<T> theBack;
    private int counter;
//constructor
    public AnimalShelter(){
        this.theFront = null;
        this.theBack = null;
        this.counter = 0;
    }
//if there is nothing there
    public boolean nothingHere(){
        return this.theFront == null;
    }
//getter for the front in the queue
    public Node<T> getTheFront() {
        return theFront;
    }
//getter for the counter. for testing
    public int getCounter() {
        return counter;
    }
//putting animals (dogs or cats) into the Animal Shelter
    public void enqueue(T species){
        Node poorAnimal = new Node(species);
        if(theFront == null){
            theFront = poorAnimal;
            theBack = poorAnimal;
            counter++;
        } else {
            theBack.next = poorAnimal;
            theBack = poorAnimal;
            counter++;
        }
    }
//Getting a dog or cat out of the animal shelter based on preference
//If there is no preference then return null
    public Object dequeue(String pref){
        Node previous = this.theFront;
        Node current = this.theFront;
        while(current != null){
            //if the current is the pref then return
            if(current.data.toString() == pref) {
                if(current == previous && current.next == null){
                    this.theFront = null;
                    this.theBack = null;
                    //the hot potato thing is really confusing (on deck circle)
                } else if (current == previous && current.next != null){
                    this.theFront = this.theFront.next;
                    //moving up the queue to get adopted
                } else if(current == this.theBack) {
                    this.theBack = previous;
                }
                //Counter for testing purposes
                counter--;
                return current.data;
            }
            if(previous != current){
                previous = previous.next;
            }
            current = current.next;
        }
        return null;
    }
//Node class which this time I put in the Animal Shelter java file
    public class Node<T> {
        Node<T> next;
        T data;

        public Node(T data){
            this.data = data;
        }
    }

}

