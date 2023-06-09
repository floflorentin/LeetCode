package fr.leetcode.easy.havles_alike;

import java.util.stream.IntStream;

/**
 * <a href="https://leetcode.com/problems/determine-if-string-halves-are-alike/">determine-if-string-halves-are-alike</a>
 */
public class Solution {


    public boolean halvesAreAlike(String s) {
        return sumHalf(s.substring(0, s.length() / 2)) ==
                sumHalf(s.substring(s.length() / 2));
    }

    public int sumHalfStream(String s) {
        return s.chars().map(i -> {
            if(isVoyelle(i)) {
                return 1;
            }
            return 0;
        }).sum();
    }

    public long sumHalf(String s) {
        return IntStream.range(0, s.length())
                .filter(i -> isVoyelle(s.charAt(i)))
                .count();
    }
    public boolean isVoyelle(int c) {
        return switch (c) {
            case   'a', 'e', 'i', 'u', 'o', 'A', 'E', 'I', 'U', 'O' -> true;
            default -> false;
        };
    }
}