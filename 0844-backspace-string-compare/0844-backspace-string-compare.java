class Solution {
    public boolean backspaceCompare(String s, String t) {

        return build(s).equals(build(t));
    }

    private String build(String str) {

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {

            if (ch == '#') {

                if (!stack.isEmpty()) {
                    stack.pop();
                }

            } else {
                stack.push(ch);
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.reverse().toString();
    }
}