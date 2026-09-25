package Array_Questions;

import java.util.Arrays;

public class Q881 {
    public static void main(String[] args) {
        int [] people = {3,2,2,1};
        int limit =3;
        int ans =0;
        // Step 1:
        Arrays.sort(people);

        // Step 2:
        int left =0;
        int right = people.length-1;

        // Step 3:
        while (left<=right){
            if (people[left]+people[right]<=limit) {
                ans++;
                left++;
                right--;
            }
               else
            {   ans++;
                right --;
            }
        }
        System.out.println(ans);

    }


}
