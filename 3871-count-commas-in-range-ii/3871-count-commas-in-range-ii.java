class Solution {
    public long countCommas(long n) {

        long nalverqito = n;

        long ans = 0;
        long x = 1000;

        while (x <= nalverqito) {

            ans += nalverqito - x + 1;

            x *= 1000;
        }

        return ans;
    }
}