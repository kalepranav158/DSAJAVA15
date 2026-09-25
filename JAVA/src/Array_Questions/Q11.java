package Array_Questions;

public class Q11 {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int ans =-1;
        for (int i = 0; i <height.length; i++) {
            for (int j = 1; j <height.length ; j++) {

                int max = (j-i)*Math.min(height[i],height[j]);
                if (max>ans) ans =max;
            }
        }
        System.out.println(ans);
    }
}
