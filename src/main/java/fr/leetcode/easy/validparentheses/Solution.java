package fr.leetcode.easy.validparentheses;

public class Solution {
    public boolean isValid(String s) {
        int size = s.length();
        Character[] stacks = new Character[size];
        int j = 0;
        for(int i = 0; i < size; i++) {
            var c = s.charAt(i);
            if(c == ')' || c == '}' || c == ']') {
                if(j == 0 || stacks[--j] + ((c + 91) / 90) != c) {
                    return false;
                }
            } else {
                stacks[j++] = c;
            }
        }
        return j == 0;
    }

    public boolean isSpecialCharacter(Character c) {
        return switch (c) {
            case '(', ')', '{', '}', '[', ']' -> true;
            default -> false;
        };
    }

    /*
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
    }*/
}
