package Array_Questions;

public class Q1295 {
    public static void main(String[] args) {
        int []nums= {555,901,482,1771};
        String [] temp = new String[nums.length];
                int ans=0;
        for (int i = 0; i <nums.length ; i++) {
                    temp[i]= nums[i]+"";
                    int length = temp[i].length();
                    if (length%2==0) ans++;
        }

        System.out.println(ans);
            }
}


