class Solution {
public:
    int missingMultiple(vector<int>& nums, int k) {
        vector<int> arr;

        for(int i = 0; i < nums.size(); i++) {
            if(nums[i] % k == 0 )
                arr.push_back(nums[i]);
        }

        sort(arr.begin(), arr.end());

        int mult = k;

        for(int i = 0; i < arr.size(); i++) {
            if(arr[i] < mult) continue;
            if(arr[i] == mult)
              mult += k;
            else
              return mult;
        }

        return mult;
    }
};