package fr.leetcode.easy.palindrome;

/**
 * <a href="https://leetcode.com/problems/palindrome-number/">palindrome-number</a>
 */
class Solution {
    public boolean isPalindrome(int x) {
        return isPalindrome(x + "");
    }

    public boolean isPalindrome(String x) {
        while (!x.isEmpty()) {
            if(!(x.substring(0, 1).equals(x.substring(x.length() - 1)))) {
                return false;
            }
            if(x.length() == 1) return true;
            x = x.substring(1, x.length() - 1);
        }
        return true;
    }

    private boolean isPattern(String x) {
        if(x.isEmpty() || x.length() == 1) {
            return true;
        }
        return x.startsWith(x.substring(x.length() - 1)) &&
                isPattern(x.substring(1, x.length() - 1));
    }

}