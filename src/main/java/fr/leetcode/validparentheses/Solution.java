package fr.leetcode.validparentheses;

import java.util.stream.Collectors;

public class Solution {

    // Loop through the string and increment each open

    public boolean isValid(String s) {
        return false;
    }

    public boolean isSpecialCharacter(Character c) {
        return switch (c) {
            case '(', ')', '{', '}', '[', ']' -> true;
            default -> false;
        };
    }

    public String removingUselessCharacters(String s) {
        return  s.chars().mapToObj(x -> (char) x)
                .filter(this::isSpecialCharacter)
                .map(Object::toString)
                .collect(Collectors.joining());
    }

    public boolean compareStartAndEndOfString(String s) {
        var sLength = s.length();
        if(sLength % 2 != 0) {
            return false;
        }
        var cs = s.toCharArray();
        for(int min = 0, max = sLength - 1; min >= max; min++, max--) {
           if(cs[min] != cs[max]) {
               return false;
           }
        }
        return true;
    }


}
