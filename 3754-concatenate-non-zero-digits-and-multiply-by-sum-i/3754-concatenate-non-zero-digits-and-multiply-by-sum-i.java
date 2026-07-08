class Solution {
    public long sumAndMultiply(int n) {
        int x = 0;
        int sum = 0;
        int place = 1;

        while (n > 0) {
            int digit = n % 10;

            if (digit != 0) {
                x += digit * place;
                place *= 10;
                sum += digit;
            }

            n /= 10;
        }

        return 1L * x * sum;
    }
}


// class Solution {
//     public int concatenateAndMultiply(int n) {
//         StringBuilder sb = new StringBuilder();
//         int temp = n;
        
//         // Step 1: Build x by skipping zeros
//         while (temp > 0) {
//             int digit = temp % 10;
//             if (digit != 0) {
//                 sb.insert(0, digit); // prepend digit
//             }
//             temp /= 10;
//         }
        
//         int x = sb.length() == 0 ? 0 : Integer.parseInt(sb.toString());
        
//         // Step 2: Calculate sum of digits
//         int sum = 0;
//         int copy = x;
//         while (copy > 0) {
//             sum += copy % 10;
//             copy /= 10;
//         }
        
//         // Step 3: Return result
//         return x * sum;
//     }
// }
