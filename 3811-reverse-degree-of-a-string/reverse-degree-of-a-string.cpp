class Solution {
public:
    int reverseDegree(string s) {
        int count = 1;
        int res = 0;
        for(int i = 0; i < s.size(); i++){
            int temp = 'z' - s[i] + 1;
            temp *= count++;
            res += temp;
        }
        return res;
    }
};