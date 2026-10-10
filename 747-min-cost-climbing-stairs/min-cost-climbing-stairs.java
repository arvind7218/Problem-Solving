class Solution {

    Map<Integer, Integer> mp = new HashMap<>();
    public int dp(int[] cost, int n){
        if(mp.containsKey(n)) return mp.get(n);
        if(n <= 1) return 0;
       mp.put(n,Math.min(cost[n-2] + dp(cost,n-2), cost[n-1] + dp(cost,n-1)));
       return mp.get(n);
    }

    public int minCostClimbingStairs(int[] cost) {
      return dp(cost, cost.length);        
    }
}