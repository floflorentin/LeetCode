package fr.leetcode.calculator;

public class Solution {
    public int calculate(String s) {
        if(s.isEmpty()) {
            return 0;
        }
        s = "(" + s + ")";
        return eval(s);
    }

    private int eval(String s) {
        int sign = 1;
        int value = 0;
        int val = 0;
        for(char c:s.toCharArray()) {
            switch (c) {
                case '+' :
                    val = val + sign * value;
                    value = 0;
                    sign = 1;
                    break;
                case '-' :
                    val = val - sign * value;
                    value = 0;
                    sign = - 1;
                    break;
                case '(' :
                    return val += eval(s);
            }
        }
        return 1;
    }
}
