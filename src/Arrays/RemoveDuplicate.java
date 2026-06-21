package Arrays;

import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int i = 0; // last unique element index

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1; // number of unique elements
    }
}

public class RemoveDuplicate {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        Solution obj = new Solution();

        int k = obj.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        // Print only the first k elements
        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        // Optional: print full array to understand what changed
        System.out.println("Full array: " + Arrays.toString(nums));
    }
}