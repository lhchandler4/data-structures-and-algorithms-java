package Java.Graph;

public class Edge<T> {


    public int weight;

    public Node<T> getNode() {
        return node;
    }

    public void setNode(Node<T> node) {
        this.node = node;
    }

    public Node<T> node;

    public Edge(Node<T> node){
        this.node = node;
    }

    public Edge(Node<T> node, int weight){
        this.node = node;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
