package fr.leetcode.medium.three_sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testSimple() {
        var solution = new Solution();
        var input = new int[] {-1,0,1,2,-1,-4};

        List<List<Integer>> output = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>(List.of(-1,-1,2));
        output.add(row1);
        List<Integer> row2 = new ArrayList<>(List.of(-1,0,1));
        output.add(row2);

        assertIterableEquals(output, solution.threeSum(input));
    }

    @Test
    void testSimple2() {
        var solution = new Solution();
        var input = new int[] {0,1,1};

        List<List<Integer>> output = new ArrayList<>();
        assertIterableEquals(output, solution.threeSum(input));
    }

    @Test
    void testSimple3() {
        var solution = new Solution();
        var input = new int[] {0,0,0};

        List<List<Integer>> output = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>(List.of(0,0,0));
        output.add(row1);

        assertIterableEquals(output, solution.threeSum(input));
    }

    @Test
    void testZero() {
        var solution = new Solution();
        var input = new int[] {0,0,0,0};

        List<List<Integer>> output = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>(List.of(0,0,0));
        output.add(row1);

        assertIterableEquals(output, solution.threeSum(input));
    }

    @Test
    void testHardestCase() {
        var solution = new Solution();
        var input = new int[] {-1,0,1,2,-1,-4};

        List<List<Integer>> output = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>(List.of(-1,-1,2));
        output.add(row1);
        List<Integer> row2 = new ArrayList<>(List.of(-1,0,1));
        output.add(row2);
        assertIterableEquals(output, solution.threeSum(input));
    }
    @Test
    void testHardestCase2() {
        var solution = new Solution();
        var input = new int[] {1,2,-2,-1};

        List<List<Integer>> output = new ArrayList<>();
        assertIterableEquals(output, solution.threeSum(input));
    }

}