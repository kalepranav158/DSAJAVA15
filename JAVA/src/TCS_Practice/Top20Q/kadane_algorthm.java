package TCS_Practice.Top20Q;
import java.util.Scanner;
public class kadane_algorthm {
    public static int kadane(int []arr){
        int ms= arr[0];
        int cs= arr[0];

        for(int i=1;i<arr.length;i++){
            cs = Math.max(arr[i],cs+arr[i]);
            ms= Math.max(cs,ms);
        }
        return ms;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextLine()){
            System.out.println("INVALID INPUT");
            return;
        }
        String inputLine = sc.nextLine().trim();
        if(inputLine.isEmpty()){
            System.out.println("INVALID INPUT");
            return;
        }

        String[] tokens = inputLine.split("\\s+");
        int []arr = new int[tokens.length];
        for(int i=0;i<tokens.length;i++){
            try{
             arr[i] = Integer.parseInt(tokens[i]);
            }catch(NumberFormatException e ){
                System.out.println("INVALID INPUT");
                return;
            }
        }
        int ans= kadane(arr);
        System.out.println(ans);



    }
}
