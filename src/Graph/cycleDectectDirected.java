package Graph;

import java.util.ArrayList;

public class cycleDectectDirected {
    static class Edge{
        int src;
        int dest;
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));
    }

    public static boolean isCycle(boolean[] vis,ArrayList<Edge>[] graph,boolean[] rec,int curr){
        vis[curr] = true;
        rec[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e =  graph[curr].get(i);

            if(rec[e.dest]){
                return true;
            }else if(!vis[e.dest]){
                if(isCycle(vis,graph,rec,e.dest)){
                    return true;
                }
            }
        }
        rec[curr] = false;
        return false;
    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        boolean[] rec = new boolean[v];
        boolean[] vis = new boolean[v];
        System.out.println(isCycle(vis,graph,rec,0));
    }
}
