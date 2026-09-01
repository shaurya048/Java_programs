package Graph;

import java.util.ArrayList;

public class GraphLearn {
    static class Edge{
        int src;
        int dest;
        public Edge(int src,int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(1,2));
        graph[0].add(new Edge(2,3));
        graph[0].add(new Edge(3,4));
    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        CreateGraph(graph);
        for(int i=0;i<graph.length;i++){
            Edge e =  graph[0].get(i);
            System.out.println(e.src+" "+e.dest);
        }
    }
}
