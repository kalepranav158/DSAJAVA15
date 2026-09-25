package Array_Questions;

public class Q35 {
    public static void main(String[] args) {
    int []nums={1,3,5,6};
    int target=0;

        System.out.println(searchInsert(nums,target));
    }

    public static int searchInsert(int[] nums, int target) {
    int start =0;
    int end =nums.length-1;
        int ans = find_index(nums ,target,start,end);


    return  ans ;}


    public static int find_index(int [] nums,int target,int start,int end){

       while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start;
    }


}
