package queue;

public class queues {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int end=0;

    public queues() {
        this(DEFAULT_SIZE);
    }

    public queues(int userSize) {
        this.data = new int[userSize];
    }

     public boolean isFull(){
            return end==data.length;
     }

     public boolean isEmpty(){
        return end==0;
    }

    public boolean insert(int item)
    {
        if (isFull()) return  false;
        data[end++]=item;
        return true;

    }

   public int remove() throws  Exception{
        if (isEmpty()) throw new Exception("Queue is empty ");
        int removed=data[0];

       for (int i = 1; i <end ; i++) {
          data[i-1]=data[i];
       }
      end--;

     return removed;
    }



}
