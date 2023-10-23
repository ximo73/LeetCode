public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int [] dp = new int[cost.length];
        for (int i = 0; i < dp.length; i++) {
            if(i==0 || i==1){
                dp[i] = cost[i];
            }else{
                dp[i] = Math.min(dp[i-1],dp[i-2])+cost[i];    
            }
        }
        return Math.min(dp[dp.length-1],dp[dp.length-2]);
    }
}
