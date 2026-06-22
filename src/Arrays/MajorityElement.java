package Arrays;

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int num : nums) {

            // No current candidate left
            if (count == 0) {
                candidate = num;
            }

            // Same number supports candidate
            if (num == candidate) {
                count++;
            }
            // Different number cancels one candidate occurrence
            else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int answer = majorityElement(nums);

        System.out.println(answer);
    }
}
