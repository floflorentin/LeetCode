package fr.leetcode.easy.searchinsert;

import fr.leetcode.easy.searchinsert.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testDicho1() {
        var sol = new Solution();
        var num1 = new int[] {1,3,5,6};
        var num2 = new int[] {1, 1, 3,5,6};

        assertEquals(2, sol.search(num1, 5));
        assertEquals(-1, sol.search(num1, 2));
        assertEquals(-1, sol.search(num1, 7));
    }

    @Test
    public void testDicho2() {
        var sol = new Solution();
        var num1 = new int[] {-1,0,3,5,9,12};
        var target = 9;
        var expected = 4;

        assertEquals(expected, sol.search(num1, target));
    }

    @Test
    public void testDicho3() {
        var sol = new Solution();
        var num1 = new int[] {-1,0,3,5,9,12};
        var target = 2;
        var expected = -1;

        assertEquals(expected, sol.search(num1, target));
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

    @Test
    public void testHardestCase() {
        var sol = new Solution();
        var num1 = new int[] {5};
        var target = 5;
        var expected = 0;

        assertEquals(expected, sol.search(num1, target));
    }

    @Test
    public void testHardestCase2() {
        var sol = new Solution();
        var num1 = new int[] {2,5};
        var target = 2;
        var expected = 0;

        assertEquals(expected, sol.search(num1, target));
    }

    @Test
    public void testHardestCase3() {
        var sol = new Solution();
        var num1 = new int[] {-1,0,5};
        var target = 5;
        var expected = 2;

        assertEquals(expected, sol.search(num1, target));
    }

    @Test
    public void test() {
        int i1 = 5;
        int i = 2;
        System.out.println(i1 / 2);

    }

}