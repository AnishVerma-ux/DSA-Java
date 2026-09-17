class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (int asteroid : asteroids) {

            boolean destroyed = false;

            while (!stack.isEmpty()
                    && stack.peek() > 0
                    && asteroid < 0) {

               
                if (stack.peek() < Math.abs(asteroid)) {
                    stack.pop();
                }

                
                else if (stack.peek() == Math.abs(asteroid)) {
                    stack.pop();
                    destroyed = true;
                    break;
                }

              
                else {
                    destroyed = true;
                    break;
                }
            }

           
            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        int[] ans = new int[stack.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}