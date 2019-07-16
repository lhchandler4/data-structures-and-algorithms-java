package Java.Graph;

import java.lang.reflect.Array;
import java.util.*;

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

    public static ArrayList<Node> breadthFirstTraversal(Node startingNode){
        HashSet<Node> visited = new HashSet<>();
        ArrayList answer = new ArrayList();
        Queue tempQueue  = new LinkedList();
        tempQueue.add(startingNode);
        visited.add(startingNode);
        while(!tempQueue.isEmpty()){
            Node tempNode = (Node) tempQueue.remove();
            answer.add(tempNode);
            for(Edge neighbor: (HashSet<Edge>) tempNode.neighbors){
                if(!visited.contains(neighbor.node)){
                    tempQueue.add(neighbor.node);
                    visited.add(neighbor.node);
                }
            }
        }
        return answer;
    }

    public static ArrayList<Node> depthFirstTraversal(Node startingNode){
        HashSet<Node> visited = new HashSet<>();
        ArrayList answer = new ArrayList();
        Stack tempStack  = new Stack();
        tempStack.push(startingNode);
        visited.add(startingNode);
        while(!tempStack.isEmpty()){
            Node tempNode = (Node) tempStack.pop();
            answer.add(tempNode);
            for(Edge neighbor: (HashSet<Edge>) tempNode.neighbors){
                if(!visited.contains(neighbor.node)){
                    tempStack.push(neighbor.node);
                    visited.add(neighbor.node);
                }
            }
        }
        return answer;
    }

}