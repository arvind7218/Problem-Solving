class Solution {
    Map<Integer, Integer> mp = new HashMap<>();
    public int tribonacci(int n) {
        if(mp.containsKey(n)) return mp.get(n);
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        mp.put(n, tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3));
        return mp.get(n);
    }
}