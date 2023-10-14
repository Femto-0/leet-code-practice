package Day2;

public class MinimumCost {
    public static int minCostClimbingStairs(int[] cost) {
        int i;
        int totalCost=0;
        if(cost[0]<cost[1]){
            i=0;
        }else {
            i=1;
        }
   for (int index=i; index<=cost.length-2;index++) {
       int condition=(cost.length-2)-index;
       if (condition<=0){
totalCost+=cost[index];
           break;
       }else{
       if (i <= cost.length - 1) {
           totalCost += cost[i];
           if (cost[index ] < cost[index + 2]) {
               i += 1;
           } else if(cost[index ] >= cost[index + 2]){
               index += 1;
               i += 2;
           }
       } else {
           int x = index + 2;
           if (x > cost.length - 1) {
               break;
           } else {
               totalCost += cost[i];
           }
       }
       }
   }
        return totalCost;
    }

    public static void main(String[] args) {
        int[] arr={15,10,20};
System.out.println(minCostClimbingStairs(arr));


    }

}
