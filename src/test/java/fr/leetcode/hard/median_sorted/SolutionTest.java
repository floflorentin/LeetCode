package fr.leetcode.hard.median_sorted;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testSimple() {
        var nums1 = new int[] {1,3};
        var nums2 = new int[] {2};
        var output = 2.0;

        var solution = new Solution();
        assertEquals(output, solution.findMedianSortedArrays(nums1, nums2));
    }


    @Test
    void testSimple1() {
        var nums1 = new int[] {1,2};
        var nums2 = new int[] {3,4};
        var output = 2.5;

        var solution = new Solution();
        assertEquals(output, solution.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void testSimple2() {
        var nums1 = new int[] {1,3};
        var nums2 = new int[] {2,7};
        var output = 2.5;

        var solution = new Solution();
        assertEquals(output, solution.findMedianSortedArrays(nums1, nums2));
    }

}