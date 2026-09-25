package Hashing_concept;

import javax.sound.sampled.Line;
import java.util.LinkedList;

public class practice_hashmap {
    static class  hsmp < K,V > {
        class Node{
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        int n;
        int N;
        LinkedList<Node> []bucket ;


        public hsmp() {
            this.N = 5;
            for (int i =0;i<N;i++) bucket[i]=new LinkedList<>();
        }


        private int Code(K key){return Math.abs(key.hashCode())%N;}

        public int search(K key,int bi){
            int i =-1;
            for (Node node:bucket[bi])
            {   i++;
                if (node.key.equals(key)) return i;
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node>[] oldbuckets=bucket;
            N=N*2;
           bucket = new LinkedList[N];

           for (int i =0;i<N;i++){
           bucket[i]=new LinkedList<>();
           }
            n=0;
           for (LinkedList<Node>LL:oldbuckets) {
               for (Node node :LL){
                   put(node.key,node.value);
               }
           }
        }


        public void put(K key,V value){
            int bi=Code(key);
            int di= search(key,bi);
            if (di==-1) {
                bucket[bi].add(new Node(key,value));
                n++;
            } else  bucket[bi].get(di).value=value;
            double l = (double) n/N ;
           if (l>2.0) rehash();
        }
    }


}
