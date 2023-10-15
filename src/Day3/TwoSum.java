package Day3;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] arr= new int[2];
        for (int i=0; i<=nums.length-1; i++){
            for (int j=i+1; j<=nums.length-2; j++){
                int sum= nums[i] + nums[j];
                if(sum==target ){
                    arr[0]=i;
                        arr[1] = j;
                        break;

                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums= {3,2,4};
       System.out.println(Arrays.toString(twoSum(nums,6)));
    }
}
