class Solution {

    public int dp(int i, int[] nums, Map<Integer,Integer> mp){
        if(i == 0) return nums[i];
        if(i == 1) return Math.max(nums[0], nums[1]);

        if(mp.containsKey(i)) return mp.get(i);
        
        mp.put(i, Math.max(nums[i] + dp(i - 2, nums, mp), dp(i - 1, nums, mp)));
        return mp.get(i);
    }

    public int rob(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        return dp(nums.length - 1, nums, mp);
    }
}