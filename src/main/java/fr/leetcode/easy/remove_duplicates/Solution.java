package fr.leetcode.easy.remove_duplicates;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">remove-duplicates-from-sorted-array</a>
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        var tmp = nums[0];
        var j = 1;
        for(int i = 1; i < nums.length; i++) {
            if(tmp != nums[i]) {
                nums[j++] = nums[i];
            }
            tmp = nums[i];
        }
        return j;
    }
}
