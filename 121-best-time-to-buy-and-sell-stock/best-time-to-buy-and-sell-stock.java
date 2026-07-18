class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int mProf = 0;
        for(int i = 1 ; i < prices.length; i++){
            if(min > prices[i]) min = prices[i];
            int diff = prices[i] - min;
            if(mProf < diff) mProf = diff;
        }
        return mProf;
    }
}