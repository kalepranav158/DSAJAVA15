package Graph_Theory;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class dijkstra_allgorithm {
   static  int V=7;

    public static class Edge{
        int src;
        public int dist;
        int wgt;
        public Edge(int src, int dest,int wgt) {
            this.src = src;
            this.dist = dest;
            this.wgt=wgt;
        }
    }


    static class pair implements Comparable<pair>{
        int node;
        int dist;

        public pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }
    @Override // here in priority queue on dist basis it will compare
    public int compareTo(pair p2)
        {   return this.dist =p2.dist;
                 }
    }

    public static void createGraph(ArrayList<Graphs.Edge> graph[]){
        for (int i =0;i<graph.length;i++){
            graph[i] =new ArrayList<>();
        }
        // add the edges here



    }

    public void dijkstra(ArrayList<Edge>graph[],int src){
        PriorityQueue<pair> pq = new PriorityQueue<>();
        int [] dist =new int[V];
        for (int i = 0; i <V ; i++) {
            if (i!=src) dist[i]=Integer.MAX_VALUE;


        }
        boolean [] vis = new boolean[V];
        pq.add(new pair(0,0));


        while (!pq.isEmpty()){
            pair curr =pq.remove();
            if (!vis[curr.node]){
                vis[curr.node]=true;

                for (int i = 0; i <graph[curr.node].size() ; i++) {
                    Edge e = graph[curr.node].get(i);
                    int u =e.src;
                    int v=e.dist;
                    if (dist[u]+e.wgt<dist[v])
                        dist[v]=dist[u]+e.wgt;
                }
            }
         }
       }



    public static void main(String[] args) {
        ArrayList<Graphs.Edge> graph[]=new ArrayList[V];
        createGraph(graph);



    }






}
