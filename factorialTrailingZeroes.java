class Solution {
    public int trailingZeroes(int n) {
        long p=5;
        int ans=0;
        while ((n/p)>0) {
            ans += (n/p);
            p*=5;
            
        }
        return ans;
    }
}
