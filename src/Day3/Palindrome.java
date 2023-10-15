package Day3;

import java.sql.Struct;
import java.util.TreeMap;

public class Palindrome {
    public static boolean isPalindrome(int x){
//        String convert= String.valueOf(x);
//        int[]arr= new int[2];
//         arr[0]=convert.charAt(0);
//         arr[1]=convert.charAt(convert.length()-1);
//        if (arr[0] != arr[1]) {
//            return false;
//        }

        String convert=String.valueOf(x);
        if(convert.length()!=1) {
            int[] arr = new int[convert.length()];
            for (int a = 0; a <= convert.length() - 1; a++) {
                arr[a] = convert.charAt(a);
            }
            int[] arr1 = new int[convert.length() / 2];
            int[] arr2 = new int[convert.length() / 2];
            int num = arr.length / 2;
            for (int i = 0; i <= num - 1; i++) {
                arr1[i] = arr[i];
            }
            int y = 0;
            if (arr.length%2!=0) {
                num += 1;
            }
            for (int j = arr.length - 1; j >= num; j--) {
                arr2[y] = arr[j];
                y++;
            }

            for (int i = 0; i <= arr1.length - 1; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
        }
    return  true;
    }

    public static void main(String[] args) {
       System.out.println( isPalindrome(21120));
    }
}
