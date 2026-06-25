package Strings;

public class LengthOfLastWord {

    public static void main(String[] args) {

        String s = "Hello World   ";

        int result = lengthOfLastWord(s);

        System.out.println(result); // 5
    }

    public static int lengthOfLastWord(String s) {

        int count = 0;


        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == ' ') {


                if (count > 0) {
                    break;
                }

            } else {

                count++;
            }
        }

        return count;
    }
}