package fr.leetcode.medium.longest;

import java.util.ArrayList;

/**
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">longest-substring-without-repeating-characters</a>
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<String> chars = new ArrayList<>();
        String longest = "";
        String longestInProgress = "";
        for(char c: s.toCharArray()) {
            if(chars.contains(c + "")) {
                if(longest.length() <= longestInProgress.length()) {
                    longest = longestInProgress;
                }
                var tmp = longestInProgress.split(c + "");
                if(tmp.length == 2) {
                    longestInProgress = tmp[1];
                } else{
                    longestInProgress = "";
                }
                if(tmp.length != 0) {
                    for(char ctmp: tmp[0].toCharArray()) {
                        chars.remove(ctmp + "");
                    }
                }
                chars.remove(c + "");
            }
            chars.add(c + "");
            longestInProgress += c;
        }
        return Math.max(longestInProgress.length(), longest.length());
    }
}