//package Graph_Theory.Temo;
//
//import Graph_Theory.Graphs;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class practice {
//
//
//    public static void bfs(ArrayList<Graphs.Edge>graph[]) {
//        Queue<Integer> q = new LinkedList<>();
//        boolean[] vis = new boolean[4];
//
//        q.add(0);
//        while (!q.isEmpty()) {
//            int curr = q.remove();
//            if (!vis[curr]) {
//                System.out.println(curr);
//                for (int i = 0; i < graph[curr].size(); i++) {
//                    Graphs.Edge e = graph[curr].get(i);
//                    q.add(e.dest);
//                }
//            }
//
//
//        }
//
//    }
//}