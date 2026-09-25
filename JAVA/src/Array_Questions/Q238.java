//package Array_Questions;
//
//public class Q238 {
//    public static void main(String[] args) {
//             int []nums={};
//
//            int [] ans = new int[nums.length];
//            int[] prefix = nums.length();
//            int[] suffix = nums.length();
//
//            for(int i =0;i<nums.length();i++){
//                prefix[i]=0;
//                suffic[i]=0;
//                ans[i]=0;
//            }
//
//            for(int i=1;i<nums.length();i++){
//                prefix[i]*=nums[i-1];
//            }
//
//            for(int i=1;i<nums.length();i++){
//                suffix[i]*=nums[i-1];
//            }
//
//            for(int i=0;i<nums.length();i++){
//                ans[i]=prefix[i]*suffix[i];
//            }
//
//            return ans; }
//
//
//    }
//}
