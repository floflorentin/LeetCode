package fr.leetcode.medium.jumpgame;

/**
 * <a href="https://leetcode.com/problems/jump-game/">jump-game</a>
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        for(int i = 0; i < nums.length; ) {
            if(nums[i] + i < nums.length - 1) {
                i = nums[i] + i;
            } else return nums[i] + i == nums.length - 1;
        }
        return false;
    }

    public boolean canJumpRecursive(int[] nums, int n) {
        if(n == nums.length - 1) {
            return true;
        }
        if(n > nums.length - 1 || nums[n] == 0) {
            return false;
        }
        for(int i = nums[n] + n; i != n; i--) {
            if(canJumpRecursive(nums, i)) {
                return true;
            }
        }
        return false;
    }

    public boolean canJumpBackWard(int[] nums) {
        if(nums.length == 1) {
            return true;
        }
        var indexNeeded = 0;
        for(int i = nums.length - 2; i != -1; i--) {
            if(nums[i] == 0) {
                indexNeeded++;
            } else if(nums[i] > indexNeeded++) {
                indexNeeded = 0;
            }
        }
        return indexNeeded == 0;
    }
}
