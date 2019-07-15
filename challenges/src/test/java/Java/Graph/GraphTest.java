package Java.Graph;

import org.junit.Test;

import java.util.HashSet;

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

        assertTrue(one.addNeighbor(two, 108));
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

}