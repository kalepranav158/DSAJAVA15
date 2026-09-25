package Graphs;

import java.util.ArrayList;

public class Representation_Adjancancy_LIstf {

    public static void main(String[] args) {
        int vertices=3;
        int edge=3;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <=vertices; i++) {
            graph.add(new ArrayList<>());
        } //each index will represnt the number of node

         graph.get(1).add(1);
         graph.get(1).add(2);

    }


}
