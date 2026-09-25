package Recursion;

public class practice04 {
    public static void main(String[] args) {
        int [] arr ={1,2,3,3,4,5,6};
        System.out.println(search(arr,3,0,arr.length-1));

    }

    static int search(int []arr,int target ,int start ,int end)
    {
        if (start>end) return -1;
        int mid = start+(end-start)/2;



        if( arr[mid] == target) return arr[mid];
        if (arr[start]<=arr[mid ])
            if (target>=arr[start]&& target<=arr[mid])
              search(arr, target,start,mid-1);
             else search(arr, target,mid+1,end);   // search in right half

        if (target>=arr[mid] && target <=arr[end])  return search(arr,target,mid+1,end);
        else  return search(arr,target,start,end-1);
    }



}
/* case 1 : if array[started] < array[mid]    -> sorted
                    if(key>=arr[start]&& key<=arr[mid])   searching that the key is present in first half of original array
                          end = mid -1
                    else                                  otherwise search in laast j=half of original array
                         start = mid+1

   case 2: if key< arr[mid] && key < arr[end]
                     start =mid +1
   case 3 : else  end =mid -1

*/