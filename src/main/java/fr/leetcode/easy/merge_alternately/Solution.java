package fr.leetcode.easy.merge_alternately;

/**
 * <a href="https://leetcode.com/problems/merge-strings-alternately/">merge-strings-alternately</a>
 */
public class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1.length() < word2.length()) {
            return word1.charAt(0) + mergeAlternately(word2, word1.substring(1));
        }
        var outputString = new StringBuilder();
        for(int i = 0; i < word2.length(); i++) {
            outputString.append(word1.charAt(i))
                    .append(word2.charAt(i));
        }
        return outputString.append(word1.substring(word2.length())).toString();
    }
}
