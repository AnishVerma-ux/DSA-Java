class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        if (needleLength > haystackLength) {
            return -1;
        }

        for (int startIndex = 0; startIndex <= haystackLength - needleLength; startIndex++) {
            if (haystack.substring(startIndex, startIndex + needleLength).equals(needle)) {
                return startIndex;
            }
        }

        return -1;
    }
}
