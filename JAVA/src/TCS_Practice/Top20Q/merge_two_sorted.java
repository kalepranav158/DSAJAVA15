//package TCS_Practice.Top20Q;
//import java.util.Scanner;
//public class merge_two_sorted {
//
//
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//
//        if(!sc.hasNextLine()){
//            System.out.println("INVALID INPUT");
//            return;
//        }
//
//        String arr1 = sc.nextLine().trim();
//        String arr2 = sc.nextLine().trim();
//
//        String[]ar1= arr1.split("\\s+");
//        String[]ar2= arr2.split("\\s+");
//
//        int [] a1 = new int[ar1.length];
//        int [] a2 = new int[ar2.length];
//
//        for(int i =0;i<ar1.length;i++){
//             try {
//                 a1[i] = Integer.parseInt(ar1[i]);
//             }catch(NumberFormatException e){
//                 System.out.println("INVALID INPUT");
//             }
//             }
//        for(int i=0;i<ar2.length;j++){
//
//        }
//
//
//
//        int ans[]=new int[a1.length+a2.length];
//        int i =0;
//        int j=0;
//        int k=0;
//        while(i<a1.length&&j<a2.length) {
//            if (a1[i] <= a2[j]) {
//                ans[k++] = a1[i++];
//            } else {
//                ans[k++] = a2[j++];
//            }
//        }
//        while(i<a1.length){
//            ans[k++]= a1[i++];
//        }
//        while(j<a2.length){
//            ans[k++]= a2[j++];
//        }
//
//    }
//}
