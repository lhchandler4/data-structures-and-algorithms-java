package Java.GetEdge;
import Java.Graph.Node;
import Java.Graph.Edge;
import Java.Graph.Graph;
import java.util.HashSet;

public class GetEdge<T> {

        boolean directPossible = false;
        int cost = 0;

    public GetEdge(){}

    public GetEdge(boolean output, int cost){
            this.directPossible = output;
            this.cost = cost;
        }
        public GetEdge directRoute(Graph input, String[] inputArr){
            HashSet<Node> n = input.getNodes();
            Node current = null;
            int cost = 0;
            for(Node node : n){
                if(node.data.equals(inputArr[0])){
                    current = node;
                }
            }
            if(current == null){
                GetEdge answer = new GetEdge(false, 0);
                return answer;
            }
            HashSet<Edge> edges;
            boolean checked;
            for(int i = 1; i < inputArr.length; i++){
                edges = current.getNeighbors();
                checked = false;
                for(Edge e : edges){
                    if(e.getNode().data.equals(inputArr[i])){
                        cost += e.getWeight();
                        checked = true;
                        current = e.getNode();
                    }
                }
                if(!checked){
                    GetEdge answer = new GetEdge(false, 0);
                    return answer;
                }
            }
            GetEdge answer = new GetEdge(true, cost);
            return answer;
    }
}

