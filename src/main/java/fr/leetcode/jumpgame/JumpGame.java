package fr.leetcode.jumpgame;

public class JumpGame {
    public boolean canJump(int[] nums) {
        System.out.println("LGHT " + nums.length + " ");
        for(int i = 0; i < nums.length; ) {
            System.out.println("VALUE OF JUMP : " + nums[i] + "  >> INDEX : " + i);
            if(nums[i] + i < nums.length - 1) {
                i = nums[i] + i;
                System.out.println("NEW I : " + i + " ");
            } else if(nums[i] + i == nums.length - 1) {
                return true;
            } else {
                return false;
            }
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
