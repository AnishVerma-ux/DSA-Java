import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        HashSet<Integer> reserved = new HashSet<>();
        HashSet<Integer> rows = new HashSet<>();

        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];

            reserved.add(row * 11 + col);
            rows.add(row);
        }

        int count = (n - rows.size()) * 2;

        for (int row : rows) {

            boolean left =
                    !reserved.contains(row * 11 + 2) &&
                    !reserved.contains(row * 11 + 3) &&
                    !reserved.contains(row * 11 + 4) &&
                    !reserved.contains(row * 11 + 5);

            boolean middle =
                    !reserved.contains(row * 11 + 4) &&
                    !reserved.contains(row * 11 + 5) &&
                    !reserved.contains(row * 11 + 6) &&
                    !reserved.contains(row * 11 + 7);

            boolean right =
                    !reserved.contains(row * 11 + 6) &&
                    !reserved.contains(row * 11 + 7) &&
                    !reserved.contains(row * 11 + 8) &&
                    !reserved.contains(row * 11 + 9);

            if (left && right) {
                count += 2;
            } else if (left || middle || right) {
                count += 1;
            }
        }

        return count;
    }
}