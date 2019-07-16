package Java.Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph<T> {

    public HashSet<Node<T>> nodes;

    public Graph(){
        this.nodes = new HashSet<>();
    }

    public Node<T>addNode(T data){
        Node node = new Node(data);
        this.nodes.add(node);
        return node;
    }

    public boolean addEdge(Node<T> source, Node<T> destination){
        if(this.nodes.contains(source) && this.nodes.contains(destination)){
            this.nodes.add(source);
            this.nodes.add(destination);
            return true;
        }
        return false;
    }

    public HashSet<Node<T>>getNodes(){
        return this.nodes;
    }

    public HashSet<Edge> getNeighbors(Node<T> node){
        return node.neighbors;
    }

    public int getNodeNum(){
        return this.nodes.size();
    }

//    public int size(Node startingNode){
//        HashSet<Node> beenThere = new HashSet<>();
//        Queue<Node> toBeCounted = new LinkedList<>();
//        toBeCounted.add(startingNode);
//        beenThere.add(startingNode);
//        int size = 0;
//        while(!toBeCounted.isEmpty()){
//            Node current = toBeCounted.remove();
//            size++;
//            for(Node neighbor : current.neighbors){
//                if(!beenThere.contains(neighbor)){
//                    toBeCounted.add(neighbor);
//                    beenThere.add(neighbor);
//                }
//            }
//        }
//        return size;
//    }
}