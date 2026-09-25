public class Q42 {
    public static void main(String[] args) {
       int [] height ={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
    public static int  trap(int[] height) {
        int ans =0;

      for (int i =1;i<height.length-1;i++){
          int diff = Math.abs((height[i+1]-height[i-1]));
          if (diff>height[i]) ans +=  (diff-height[i]);
      }
      return ans;


    }

}
