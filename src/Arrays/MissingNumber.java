package Arrays;

public class MissingNumber {

    public static int missingNumber(int[] nums) {

        int n = nums.length;

        // Sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;

        // Sum of numbers present in array
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int[] nums1 = {3, 0, 1};
        int[] nums2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println(missingNumber(nums1)); // 2
        System.out.println(missingNumber(nums2)); // 8
    }
}