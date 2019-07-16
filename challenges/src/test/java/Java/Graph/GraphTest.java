package Java.Graph;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class GraphTest {
    @Test
    public void graphIsEmpty(){
        Graph graph = new Graph();
        assertEquals(0, graph.getNodeNum());
    }

    @Test
    public void addANode() {
        Graph testing = new Graph();
        Node one = testing.addNode("one");
        Node two = testing.addNode("two");
        Node three = testing.addNode("three");

        assertTrue(testing.getNodeNum() == 3);
        assertTrue(testing.getNodes().contains(one));
        assertTrue(testing.getNodes().contains(two));
        assertTrue(testing.getNodes().contains(three));
    }

    @Test
    public void addAnEdge() {
        Graph testing = new Graph();
        Node one = testing.addNode("one");
        Node two = testing.addNode("two");
        Node three = testing.addNode("three");

        assertTrue(testing.addEdge(one, two));
        assertTrue(testing.addEdge(one, three));

    }

    @Test
    public void getTheNodes() {
        Graph testing = new Graph();
        Node one = testing.addNode("one");
        Node two = testing.addNode("two");
        Node three = testing.addNode("three");

        HashSet<Node> expected = new HashSet<>();
        expected.add(one);
        expected.add(two);
        expected.add(three);

        assertTrue(testing.getNodes().equals(expected));
    }

    @Test
    public void addANeighbor(){
        Graph testing = new Graph();
        Node one = testing.addNode("one");
        Node two = testing.addNode("two");

        assertTrue(one.addNeighbor(two));
    }

    @Test
    public void getNeighbors() {
        Graph testing = new Graph();
        Node one = testing.addNode("one");
        Node two = testing.addNode("two");
        Node three = testing.addNode("three");

        one.addNeighbor(two);
        one.addNeighbor(three);

        HashSet expected = new HashSet<>();
        expected.add("two");
        expected.add("three");

        assertEquals(expected.size(), testing.getNeighbors(one).size());
    }

    @Test
    public void getSize() {
        Graph testing = new Graph();
        testing.addNode("one");
        testing.addNode("two");
        testing.addNode("three");

        assertEquals(3,  testing.getNodeNum());

        testing.addNode("four");
        testing.addNode("five");

        assertEquals(5,  testing.getNodeNum());
    }

    @Test
    public void neighborsAndWeights(){
        Graph testing = new Graph();
        Node one = testing.addNode("one");
        Node two = testing.addNode("two");
        one.addNeighbor(two, 25);
        assertEquals(one.getNeighbors().size(), 1);
        for(Object edge: one.neighbors) {
            Edge e = (Edge) edge;
            assertEquals(e.weight, 25);
        }
    }

    @Test
    public void testingBreadthTraversal() {
        Graph testing = new Graph();
        Node one = testing.addNode("one");
        Node two = testing.addNode("two");
        Node three = testing.addNode("three");
        Node four = testing.addNode("four");
        one.addNeighbor(two);
        one.addNeighbor(four);
        four.addNeighbor(two);
        two.addNeighbor(three);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("four");
        expected.add("one");
        expected.add("two");
        expected.add("three");

        ArrayList result = testing.breadthFirstTraversal(four);
        for(int i=0; i<expected.size(); i++){
            System.out.println(((Node) result.get(i)).data);
            assertEquals(expected.get(i), ((Node) result.get(i)).data);
        }
    }

    @Test
    public void testingDepthTraversal() {
        Graph testing = new Graph();
        Node one = testing.addNode("one");
        Node two = testing.addNode("two");
        Node three = testing.addNode("three");
        Node four = testing.addNode("four");
        one.addNeighbor(two);
        one.addNeighbor(four);
        four.addNeighbor(two);
        two.addNeighbor(three);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("four");
        expected.add("two");
        expected.add("three");
        expected.add("one");

        ArrayList result = testing.depthFirstTraversal(four);
        for(int i=0; i<expected.size(); i++){
            System.out.println(((Node) result.get(i)).data);
            assertEquals(expected.get(i), ((Node) result.get(i)).data);
        }
    }

}