package fr.leetcode.easy.largest_substring;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/largest-substring-between-two-equal-characters/description/">largest-substring-between-two-equal-characters</a>
 */
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        var charPos = new Integer[26];
        Arrays.fill(charPos, - 1);
        var max = -1;
        var cArray = s.toCharArray();
        for(int i = 0; i < cArray.length; i++) {
            var c = cArray[i];
            if(charPos[c - 'a'] == -1) {
                charPos[c - 'a'] = i;
            } else {
                var index = charPos[c - 'a'];
                max = Math.max((i - 1) - index, max);
            }
        }
        return max;
    }
}