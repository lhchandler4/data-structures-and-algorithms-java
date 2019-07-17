package Java.GetEdge;
import Java.Graph.Node;
import Java.Graph.Graph;
import org.junit.Test;
import static org.junit.Assert.*;

public class GetEdgeTest {
    @Test
    public void testEmptyGraph(){
        GetEdge test = new GetEdge();
        Graph graph = new Graph();
        String[] testing = new String[]{"LA", "NO", "SF"};
        GetEdge expected = new GetEdge(false, 0);
        assertEquals(expected.directPossible, test.directRoute(graph, testing).directPossible);
        assertEquals(expected.cost, test.directRoute(graph, testing).cost);
    }

    @Test
    public void testDirectTrue(){
        GetEdge test = new GetEdge();
        Graph graph = new Graph();
        Node LA = graph.addNode("LA");
        Node NO = graph.addNode("NO");
        Node SF = graph.addNode("SF");
        Node NY = graph.addNode("NY");
        Node TN = graph.addNode("TN");
        Node Philly = graph.addNode("Philly");
        Node Atlanta = graph.addNode("Atlanta");
        LA.addNeighbor(NO, 60);
        LA.addNeighbor(SF, 20);
        NO.addNeighbor(NY, 30);
        NO.addNeighbor(TN, 40);
        SF.addNeighbor(Philly, 10);
        SF.addNeighbor(Atlanta, 90);
        String[] testing = new String[]{"LA", "NO", "TN"};
        GetEdge expected = new GetEdge(true, 100);
        assertEquals(expected.directPossible, test.directRoute(graph, testing).directPossible);
        assertEquals(expected.cost, test.directRoute(graph, testing).cost);
    }

    @Test
    public void testDirectFalse(){
        GetEdge test = new GetEdge();
        Graph graph = new Graph();
        Node LA = graph.addNode("LA");
        Node NO = graph.addNode("NO");
        Node SF = graph.addNode("SF");
        Node NY = graph.addNode("NY");
        Node TN = graph.addNode("TN");
        Node Philly = graph.addNode("Philly");
        Node Atlanta = graph.addNode("Atlanta");
        LA.addNeighbor(NO, 60);
        LA.addNeighbor(SF, 20);
        NO.addNeighbor(NY, 30);
        NO.addNeighbor(TN, 40);
        SF.addNeighbor(Philly, 10);
        SF.addNeighbor(Atlanta, 90);
        String[] testing = new String[]{"SF", "Atlanta", "TN"};
        GetEdge expected = new GetEdge(false, 0);
        assertEquals(expected.directPossible, test.directRoute(graph, testing).directPossible);
        assertEquals(expected.cost, test.directRoute(graph, testing).cost);
    }
}