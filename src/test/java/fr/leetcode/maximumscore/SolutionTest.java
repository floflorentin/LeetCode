package fr.leetcode.maximumscore;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static fr.leetcode.maximumscore.Solution.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testGetMaxSimpleArray() {
        var solution = new Solution();
        var expected = new MaxIndex(0,0);
        assertEquals(expected, solution.getMax(new int[] {1}, new int[] {2}));
    }

    @Test
    public void testGetMaxDoubleArray() {
        var solution = new Solution();

        var numsArr1 = new int[] {1, 2};
        var numsArr2 = new int[] {2, 1};
        var mulArr1 = new int[] {1, 2};
        var mulArr2 = new int[] {2, 1};

        var expected1 = new MaxIndex(1,1);
        var expected2 = new MaxIndex(1,0);
        var expected3 = new MaxIndex(0,0);

        assertEquals(expected1, solution.getMax(numsArr1, mulArr1));
        assertEquals(expected2, solution.getMax(numsArr1, mulArr2));
        assertEquals(expected3, solution.getMax(numsArr2, mulArr2));
    }

    @Test
    public void removeIndex() {
        var solution = new Solution();
        var givenArr = new int[] {1,2,3};
        var resultArr = solution.removeIndex(givenArr, 2);
        assertArrayEquals(new int[] {1,2}, resultArr);
        var resultArr2 = solution.removeIndex(resultArr, 0);
        assertArrayEquals(new int[] {2}, resultArr2);
        var resultArr3 = solution.removeIndex(resultArr2, 0);
        assertArrayEquals(new int[] {}, resultArr3);
        assertThrows(IllegalArgumentException.class, () -> solution.removeIndex(resultArr3, 0));
    }

    @Test
    public void testGetMaximumScore() {
        var solution = new Solution();
        var expectedMaxScore = 0;
        assertEquals(expectedMaxScore, solution.maximumScore(null, null));
    }

    @Test
    public void testValidation() {
        var solution = new Solution();
        assertFalse(solution.validation(null, null));

    }

    @Test
    public void testSimple() {
        var solution = new Solution();
        var nums = new int[] {1,2,3};
        var mul = new int[] {3,2,1};
        assertEquals(14, solution.maximumScore(nums, mul));
    }

    @Test
    public void testWithMoreElement() {
        var solution = new Solution();
        var nums = new int[] {-5,-3,-3,-2,7,1};
        var mul = new int[] {-10,-5,3,4,6};
        assertEquals(102, solution.maximumScore(nums, mul));
    }
}