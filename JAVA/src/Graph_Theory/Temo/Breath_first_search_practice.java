//package Graph_Theory.Temo;
//
//import Graph_Theory.Graphs;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Breath_first_search_practice {
//    public static void BFS(ArrayList<Graphs.Edge>graph[]){
//        Queue<Integer> q = new LinkedList<>();
//        boolean [] vis = new boolean[Graphs.V];
//        q.add(0);
//        while (!q.isEmpty())
//        {
//            int curr = q.remove();
//            if (!vis[curr]){
//                System.out.println(curr+"->");//display
//                vis[curr]=true;//visited
//                for (int i = 0; i <graph[curr].size() ; i++) {
//                    Graphs.Edge e = graph[curr].get(i);
//                    q.add(e.dest);
//                }//add in queue
//            }
//        }
//    }
//}
