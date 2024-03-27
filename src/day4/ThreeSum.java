package day4;

import java.awt.event.ActionListener;
import java.util.Arrays;

public class ThreeSum {

    public int[] threeSum(int[] arr) {
        int one=arr[0];
        int two=one;
        int three= two;
        int[] finalArray = new int[3];
        for (int i = 0; i < arr.length - 1; i++) {
             one = arr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (one != arr[j]) {
                    two = arr[j];
                }
                for (int k = 0; k < arr.length - 1; k++) {
                    if (one != arr[k] && two != arr[k]) {
                        three = arr[k];
                    }
                }
            }
            if(one+two+three==0){
                finalArray[0]=one;
                finalArray[1]=two;
                finalArray[2]=three;
                return finalArray;
            }
        }

        return null;
    }

    public int[] actuallyATwoSum(int[] arr){
        int first;
        int second;
        int third;
        Arrays.sort(arr);
for(int i=0; i<arr.length-1; i++){
    first=arr[i];

}

        return arr;
    }

    public static void main(String[] args) {
        ThreeSum ts = new ThreeSum();
        int[] array = {-1, 0, 2, -1, -4, 1};
        System.out.println(Arrays.toString(ts.threeSum(array)));
        System.out.println(Arrays.toString(ts.actuallyATwoSum(array)));
    }
}
