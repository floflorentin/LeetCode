package fr.leetcode.hard.calculator;

import fr.leetcode.hard.calculator.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testEval1() {
        var input = "1 + 1 ";
        var output = 2;
        assertEquals(output, solution.calculate(input));
    }

    @Test
    public void testEval2() {
        var input = " 2-1 + 2 ";
        var output = 3;
        assertEquals(output, solution.calculate(input));
    }

    @Test
    public void testEval3() {
        var input = "(1+(4+5+2)-3)+(6+8)";
        var output = 23;
        assertEquals(output, solution.calculate(input));
    }

    @Test
    public void testHardCase() {
        var input = "2147483647";
        var output = 2147483647;
        assertEquals(output, solution.calculate(input));
    }
}