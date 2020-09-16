package steiner;

public class MST implements Algorithm {
    public Solution run(InputParameter input){
        Graph<Node> spanningGraph = SpanningGraphConstruction.construct(input);
        SteinerTree mst = MSTConstruction.construct(spanningGraph);
        return new Solution(mst);
    }
}