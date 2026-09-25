package Basics;

public class linearsearch {

    public static void main(String[] args) {

        int[] arr1 = {48, 58, 655, 98, 56, 78, 45};
        int[] arr2 = {1};
        int[][] arr3 = {
                {1, 2, 3, 4, 5},
                {1, 0},
                {8, 9, 57}
        };
        System.out.println(searcharr(arr1,45));
        System.out.println(searcharr(arr2, 3));
        System.out.println(searcharr2d(arr3,0));
        System.out.println(min2d(arr3));

        String str ="pranav";
        String key ="Saurav";
        System.out.println(searchstr(str,key));
        System.out.println("The min is "+min(arr1));

    }

    static boolean searcharr(int[] arr, int key) {

        if (arr.length == 0) {
            System.out.println("Array is empty :");// Return -1 for an empty array
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }  // searching an element in an array

    static boolean searchstr(String s1, String key) {

        if (s1.length() == 0) {  //here length is funciton that for string "()"
            System.out.println("Array is empty :");// Return -1 for an empty array
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1 == key) {
                return true;
            }
        }
        return false;
    }  // comparing the strings

    static int min(int[] arr) {
        int min = 1000000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }  //finding minimum elemet in an array 1d

    static boolean searcharr2d(int[][] arr3, int key) {

        if (arr3.length == 0) {
            System.out.println("Array is empty :");// Return -1 for an empty array
            return false;
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if (arr3[i][j] == key)
                    return true;
            }
            return true;
        }
        return false;
    } // searchin an element in 2d array

    static int min2d(int[][] arr3) {
        int min = 1000000;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if (arr3[i][j] < min)
                    min = arr3[i][j];
            }

        }
        return min;
    } // finding minimum in 2d array
}


