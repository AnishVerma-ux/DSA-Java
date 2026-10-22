class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int zero = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zero = i;
                break;
            }
        }

        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < n; i++) {
            if (nums[(i + 1) % n] != (nums[i] + 1) % n) {
                inc = false;
            }

            if (nums[(i + 1) % n] != (nums[i] - 1 + n) % n) {
                dec = false;
            }
        }

        int ans = Integer.MAX_VALUE;

        if (inc) {
            ans = Math.min(ans, Math.min(zero, n - zero + 2));
        }

        if (dec) {
            ans = Math.min(ans,
                    1 + Math.min(zero + 1, n - 1 - zero));
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}