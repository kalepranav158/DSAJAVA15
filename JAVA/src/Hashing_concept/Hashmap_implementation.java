package Hashing_concept;

import java.util.LinkedList;

public class Hashmap_implementation {
    static class hashmap<K, V> {
        private class Node {
            K key;
            V value;
            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        private int n;          // number of nodes
        private int N;          // number of buckets
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        public hashmap() {
            this.N = 5;
            this.buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashfunction(K key) {
            return Math.abs(key.hashCode()) % N;
        }

        private int searchinll(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            N = N * 2;
            buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
            n = 0;
            for (LinkedList<Node> ll : oldBuckets) {
                for (Node node : ll) {
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key, V value) {
            int bi = hashfunction(key);
            int di = searchinll(key, bi);

            if (di == -1) {
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                buckets[bi].get(di).value = value;
            }
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashfunction(key);
            int di = searchinll(key, bi);
            return di != -1;
        }

        public V get(K key) {
            int bi = hashfunction(key);
            int di = searchinll(key, bi);

            if (di == -1) return null;
            return buckets[bi].get(di).value;
        }

        public V remove(K key) {
            int bi = hashfunction(key);
            int di = searchinll(key, bi);

            if (di == -1) return null;

            Node node = buckets[bi].remove(di);
            n--;
            return node.value;
        }

        public int size() {
            return n;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }
}
