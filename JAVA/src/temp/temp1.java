package temp;
import java.util.*;
public class temp1 {
    public static void main(String[] args) {
        int num =28;
        List<Integer>list = new ArrayList<>();

        for(int i=1;i<=num/2;i++){
            if(num%i==0)list.add(i);
        }

        int sum =0;
        for(int i =0;i<list.size()-1;i++){
            System.out.println(list.get(i));
            sum+=list.get(i);

        }
        System.out.println();
        System.out.println(sum);

    }
}
