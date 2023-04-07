package fr.leetcode.hard.median_sorted;

/**
 * <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">median-of-two-sorted-arrays</a>
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int k = (m + n) / 2;

        int low = 0;
        int high = m;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = k - partitionX;

            int minX;
            int maxX;
            int minY;
            int maxY;
            if (partitionX == 0) {
                minX = Integer.MIN_VALUE;
            } else {
                minX = nums1[partitionX - 1];
            }

            if (partitionX == m) {
                maxX = Integer.MAX_VALUE;
            } else {
                maxX = nums1[partitionX];
            }

            if (partitionY == 0) {
                minY = Integer.MIN_VALUE;
            } else {
                minY = nums2[partitionY - 1];
            }

            if (partitionY == n) {
                maxY = Integer.MAX_VALUE;
            } else {
                maxY = nums2[partitionY];
            }
            if (minX <= maxY && minY <= maxX) {
                if ((n + m) % 2 == 0) {
                    return (Math.min(maxX, maxY) + Math.max(minX, minY)) / 2.0;
                } else {
                    return Math.min(maxX, maxY);
                }
            } else if (maxX > minY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }
        return -1.0;
    }
}
