package fr.leetcode.hard.calculator;

import java.util.Arrays;
public class Solution {
    public int calculate(String s) {
        if(s.isEmpty()) {
            return 0;
        }
        return eval("(" + s + ")");
    }
    private int eval(String s) {
        int sign = 1;
        int value = 0;
        int val = 0;

        var chars = s.toCharArray();
        for(int i =1; i <= s.length() - 1; i++) {
            var c = chars[i];
            switch (c) {
                case '+':
                    val = val + sign * value;
                    value = 0;
                    sign = 1;
                    break;
                case '-':
                    val = val + sign * value;
                    value = 0;
                    sign = -1;
                    break;
                case '(':
                    val += eval(String.valueOf(Arrays.copyOfRange(chars, i, s.length() - 1))) * sign;
                    var tmp = 1;
                    while (tmp != 0 || i > chars.length) {
                        i++;
                        if(chars[i] == ')') {
                            tmp--;
                        } else if (chars[i] == '(') {
                            tmp++;
                        }
                    }
                    sign = 1;
                    break;
                case ')':
                    return val + value * sign;
                default:
                    if (Character.isDigit(c)) {
                        value = Integer.parseInt(value + "" + Character.getNumericValue(c) + "");
                    }
            }
        }
        return val;
    }
}


interface Operation {
    @FunctionalInterface
    public interface Calcul {
        int calculate(int v1, int v2);
    }
}