package TCS_Practice.TwoD_array;

public class Two_Directional_array {

   static int[] dr ={-1,1,0,0};
    static int[] dc ={0,0,-1,1};

    public static void traversal(int[][] arr, int r, int c) {
      int []dr = {-1,1,0,0};
      int[] dc= {0,0,-1,1};


        for(int k =0;k<4;k++){
            int r1 = r+dr[k];
            int c1= c+dc[k];
            System.out.println(arr[r1][c1]);
        }


    }


    public static void main(String []args){
        int [][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

       traversal(arr,1,1);
    }
}
