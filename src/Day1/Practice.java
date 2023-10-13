/*
To see if there is a combination of numbers that adds up to a given sum of number.
result: the index between which the combination was possible. Here, the ending index is also inclusive.
 */
package Day1;
import java.util.Arrays;

public class Practice {

    public static Integer[] subArraySum(int[] arr, int s) {
        int sum = 0;
        int finalIndex = 0; //represents the final index at which the sum matched up to "s".
        int initialIndex =0; //represents the initial index where the matching process started
        int i;
        int maxSum=0; //maximum sum possible for the given Array
        Integer[] list= new Integer[2]; //creating an Array to store the initial and final index
        boolean ifTrue = true;
        while (ifTrue) { //to loop until match is found or until all possibilities are exhausted
            for ( i=initialIndex; i <= arr.length - 1; i++) {
                 maxSum+=arr[i];
                if (sum < s) {
                    sum += arr[i];
                    finalIndex=i;
                }else if(sum>=maxSum || arr[i]>s){  //if given sum "s" is greater than the sum of all the values of array or arr[i] itself is greater than the sum we are looking for
                    System.out.println("Match not found");
                    ifTrue=false;
                }
            }
            if(sum==s){
                ifTrue=false;
                list[0]=initialIndex;
                list[1]=finalIndex;
            }else if(initialIndex!=arr.length-1){
                initialIndex++;
                sum=0;
            }else if(initialIndex==arr.length-1){  //if given sum "s" is greater than the sum of all the values of array
                // and also if given sum doesn't have any match in the given array
                System.out.println("Match not found");
                ifTrue=false;
            }
        }

       return list;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7};
      System.out.println( Arrays.toString(subArraySum(num, 5)));
    }
}
