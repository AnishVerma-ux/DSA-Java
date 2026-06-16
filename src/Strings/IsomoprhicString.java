package Strings;

import java.util.HashMap;
import java.util.Map;

class IsomorphicStrings{
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> sToTMap = new HashMap<>();

        Map<Character, Character> tToSMap = new HashMap<>();

        int length = s.length();


        for (int i = 0; i < length; i++) {
            char charFromS = s.charAt(i);
            char charFromT = t.charAt(i);

            if (sToTMap.containsKey(charFromS) && sToTMap.get(charFromS) != charFromT) {
                return false;
            }


            if (tToSMap.containsKey(charFromT) && tToSMap.get(charFromT) != charFromS) {
                return false;
            }


            sToTMap.put(charFromS, charFromT);
            tToSMap.put(charFromT, charFromS);
        }


        return true;
    }
        public static void main(String[] args) {
            IsomorphicStrings obj = new IsomorphicStrings();

            System.out.println(obj.isIsomorphic("egg", "add"));
            System.out.println(obj.isIsomorphic("foo", "bar"));
        }
    }



