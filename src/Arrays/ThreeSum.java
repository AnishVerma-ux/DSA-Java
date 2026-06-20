package Arrays;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Fix one number
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate fixed numbers
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Step 3: Two pointers
            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {

                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {

                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    l++;
                    r--;

                    // Skip duplicate left values
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }

                    // Skip duplicate right values
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }

                } else if (sum < 0) {
                    l++; // Need a bigger sum
                } else {
                    r--; // Need a smaller sum
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> answer = threeSum(nums);

        System.out.println(answer);
    }
}