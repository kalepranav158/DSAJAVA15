package Graph_Theory;

import java.util.*;

public class Graphs {

    public static int V = 5;   // Number of vertices

    // ---------- EDGE CLASS ----------
    public static class Edge {
        int src;
        int dest;
        int wgt;

        public Edge(int src, int dest, int wgt) {
            this.src = src;
            this.dest = dest;
            this.wgt = wgt;
        }
    }

    // ---------- PAIR CLASS FOR PRIMS / DIJKSTRA ----------
    static class Pair implements Comparable<Pair> {
        int node;
        int cost;

        public Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair o) {
            return this.cost - o.cost;
        }
    }

    // ---------- CREATE SAMPLE GRAPH ----------
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Sample weighted directed graph
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 3));
        graph[1].add(new Edge(1, 3, 4));
        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 4, 5));
    }

    // ---------- BFS ----------
    public static void Breath_first_search(ArrayList<Edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[V];

        q.add(0);
        vis[0] = true;

        System.out.print("BFS: ");

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " -> ");

            for (Edge e : graph[curr]) {
                if (!vis[e.dest]) {
                    vis[e.dest] = true;
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    // ---------- DFS ----------
    public static void Dept_first_search(ArrayList<Edge>[] graph,
                                         int curr, boolean[] vis) {

        System.out.print(curr + " -> ");
        vis[curr] = true;

        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                Dept_first_search(graph, e.dest, vis);
            }
        }
    }

    // ---------- TOPOLOGICAL SORT ----------
    public static void topological_sorting(ArrayList<Edge>[] graph,
                                           int curr, boolean[] vis,
                                           Stack<Integer> stack) {

        vis[curr] = true;

        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                topological_sorting(graph, e.dest, vis, stack);
            }
        }
        stack.push(curr);
    }

    // ---------- CYCLE IN DIRECTED GRAPH ----------
    public static boolean is_cycle_directed(ArrayList<Edge>[] graph,
                                            int curr,
                                            boolean[] vis,
                                            boolean[] rec) {

        vis[curr] = true;
        rec[curr] = true;

        for (Edge e : graph[curr]) {
            if (rec[e.dest]) return true;

            if (!vis[e.dest]) {
                if (is_cycle_directed(graph, e.dest, vis, rec))
                    return true;
            }
        }

        rec[curr] = false;
        return false;
    }

    // ---------- CYCLE IN UNDIRECTED GRAPH ----------
    public static boolean is_cycle_undirected(ArrayList<Edge>[] graph,
                                              int curr,
                                              boolean[] vis,
                                              int par) {

        vis[curr] = true;

        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                if (is_cycle_undirected(graph, e.dest, vis, curr))
                    return true;
            } else if (e.dest != par) {
                return true;
            }
        }
        return false;
    }

    // ---------- FIND ALL PATHS ----------
    public static void Find_All_paths(ArrayList<Edge>[] graph, int curr, boolean[] vis, int tar, String path) {

        if (curr == tar) {
            System.out.println(path);
            return;
        }

        vis[curr] = true;

        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                Find_All_paths(graph, e.dest, vis, tar,
                        path + " -> " + e.dest);
            }
        }

        vis[curr] = false;
    }

    // ---------- BELLMAN-FORD ----------
    public static void belleman_Ford(ArrayList<Edge>[] graph, int src) {

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int i = 0; i < V - 1; i++) {
            for (int u = 0; u < V; u++) {
                for (Edge e : graph[u]) {
                    if (dist[u] != Integer.MAX_VALUE &&
                            dist[u] + e.wgt < dist[e.dest]) {

                        dist[e.dest] = dist[u] + e.wgt;
                    }
                }
            }
        }

        System.out.println("Bellman-Ford distances:");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " -> " + dist[i]);
        }
    }

    // ---------- PRIMS MST ----------
    public static void prims(ArrayList<Edge>[] graph) {

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean[] vis = new boolean[V];

        pq.add(new Pair(0, 0));
        int mstCost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if (!vis[curr.node]) {
                vis[curr.node] = true;
                mstCost += curr.cost;

                for (Edge e : graph[curr.node]) {
                    if (!vis[e.dest]) {
                        pq.add(new Pair(e.dest, e.wgt));
                    }
                }
            }
        }

        System.out.println("MST Cost = " + mstCost);
    }

    // ---------- KOSARAJU ALGORITHM ----------
    public static void kosarajuAlgo(ArrayList<Edge>[] graph) {

        Stack<Integer> s = new Stack<>();
        boolean[] vis = new boolean[V];

        // Step 1: Topological order by finishing time
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                topological_sorting(graph, i, vis, s);
            }
        }

        // Step 2: Create transpose graph
        ArrayList<Edge>[] transpose = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            vis[i] = false;
            transpose[i] = new ArrayList<>();
        }

        for (int i = 0; i < V; i++) {
            for (Edge e : graph[i]) {
                transpose[e.dest].add(new Edge(e.dest, e.src, e.wgt));
            }
        }

        // Step 3: DFS on transpose in stack order
        System.out.println("Strongly Connected Components:");

        while (!s.isEmpty()) {
            int curr = s.pop();

            if (!vis[curr]) {
                Dept_first_search(transpose, curr, vis);
                System.out.println();
            }
        }
    }

    // ---------- MAIN ----------
    public static void main(String[] args) {

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println("Running algorithms on sample graph...\n");

        Breath_first_search(graph);

        System.out.print("DFS: ");
        Dept_first_search(graph, 0, new boolean[V]);
        System.out.println("\n");

        belleman_Ford(graph, 0);

        prims(graph);

        kosarajuAlgo(graph);

        System.out.println("\nAll Paths from 0 to 3:");
        Find_All_paths(graph, 0, new boolean[V], 3, "0");
    }
}
