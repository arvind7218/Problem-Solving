class Solution {
    public int maxProduct(int[] nums) {
        int  maxProduct = 0;
       for(int i = 0; i < nums.length-1; i++){
        for(int j = i+1; j < nums.length; j++){
            if(maxProduct < ((nums[i] - 1) * (nums[j] - 1)))  maxProduct = (nums[i] - 1) * (nums[j] - 1);
        }
       } 
       return maxProduct;
    }
}