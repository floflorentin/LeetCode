package fr.leetcode.searchinsert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testDicho() {
        var sol = new Solution();
        var num1 = new int[] {1,3,5,6};
        var num2 = new int[] {1, 1, 3,5,6};

        assertEquals(2, sol.dicho(num1, 5));
        assertEquals(1, sol.dicho(num1, 2));
        assertEquals(4, sol.dicho(num1, 7));
    }

    @Test
    public void setMidHighValue() {
        var sol = new Solution();

        assertEquals(45, sol.midHighValue(30));
        assertEquals(22, sol.midHighValue(15));
    }

    @Test
    public void setLowHighValue() {
        var sol = new Solution();

        assertEquals(15, sol.midLowValue(30));
        assertEquals(7, sol.midLowValue(15));
    }

}