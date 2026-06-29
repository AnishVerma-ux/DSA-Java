package Arrays;

class NoOfStrin {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String p : patterns) {
            if (word.contains(p)) {   // check if word contains the pattern
                count++;
            }
        }
        return count;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        NoOfStrin sol = new NoOfStrin();

        String[] patterns = {"a", "abc", "bc", "d"};
        String word = "abc";

        int result = sol.numOfStrings(patterns, word);
        System.out.println("Number of patterns found: " + result);
    }
}
