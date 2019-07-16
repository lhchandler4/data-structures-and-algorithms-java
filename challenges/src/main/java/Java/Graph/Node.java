package Java.Graph;

import java.util.HashSet;

public class Node<T> {
    public T data;
    public HashSet<Edge> neighbors;

    public HashSet<Edge> getNeighbors() {
        return neighbors;
    }

    public Node(T data){
        this.data = data;
        this.neighbors = new HashSet<>();
    }

    //This can take the place of addEdge!
    public boolean addNeighbor(Node<T> node){
        Edge edge = new Edge(node);
        this.neighbors.add(edge);
        Edge edge2 = new Edge(this);
        node.neighbors.add(edge2);

        return true;
    }

    public boolean addNeighbor(Node<T> node, int weight){
        Edge edge = new Edge(node, weight);
        this.neighbors.add(edge);
        Edge edge2 = new Edge(this, weight);
        node.neighbors.add(edge2);
        return true;
    }
}
