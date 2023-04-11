package fr.leetcode.medium.zigzag_conversion;

/**
 * <a href="https://leetcode.com/problems/zigzag-conversion/">zigzag-conversion</a>
 */
class Solution {
    public String convert(String s, int numRows) {
        if (s.length() == 1 || numRows == 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder str = new StringBuilder();
        var op = 2 * (numRows - 1);
        for (int i = 0; i < numRows; i++) {

            var modulo = i;
            while (modulo < s.length()) {
                str.append(s.charAt(modulo));

                if (firstAndLast(i, numRows)) {
                    var secondModulo = secondModulo(modulo, numRows, i);
                    if (secondModulo < s.length()) {
                        str.append(s.charAt(secondModulo));
                    }
                }
                modulo += op;
            }
        }
        return str.toString();
    }

    private boolean firstAndLast(int i, int numRows) {
        return i % (numRows - 1) != 0;
    }

    public Integer secondModulo(int modulo, int numRows, int i) {
        return modulo + (numRows - i) * 2 - 2;
    }
}
