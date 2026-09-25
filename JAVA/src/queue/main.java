package queue;

public class main {
    public static void main(String[] args) throws Exception {
        queues q = new queues();
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        q.insert(6);
        System.out.println(q.remove());

    }
}
