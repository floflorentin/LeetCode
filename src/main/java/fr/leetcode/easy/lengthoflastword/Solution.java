package fr.leetcode.easy.lengthoflastword;

import java.util.Arrays;

public class Solution {
    public int lengthOfLastWord(String s) {
        return lengthOfWords(retrieveLastWord(s));
    }

    public int lengthOfWords(String s) {
        return s.length();
    }

    public String retrieveLastWord(String s) {
        var tmp = s.split(" ");
        return tmp[tmp.length - 1];
    }
}
