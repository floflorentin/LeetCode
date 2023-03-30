package fr.leetcode.jumpgame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {
    @Test
    public void canJump() {
        int[] num1 = new int[] {2,3,1,1,4};
        int[] num2 = new int[] {3,2,1,0,4};

        var jg = new JumpGame();

    }

    @Test
    public void canJumpRecu() {
        int[] num1 = new int[] {2,3,1,1,4};
        int[] num2 = new int[] {3,2,1,0,4};
        int[] num3 = new int[] {2,0};

        var jg = new JumpGame();
        assertEquals(true, jg.canJumpRecursive(num1, 0));
        assertEquals(false, jg.canJumpRecursive(num2, 0));
        assertEquals(true, jg.canJumpRecursive(num3, 0));
    }

    @Test
    public void testConditionTrueRecu() {
        var jg = new JumpGame();

        assertEquals(true, jg.canJumpRecursive(new int[] {1}, 0));
        assertEquals(true, jg.canJumpRecursive(new int[] {0}, 0));
        assertEquals(true, jg.canJumpRecursive(new int[] {3, 1}, 0));
    }

    @Test
    public void testConditionFalseRecu() {
        var jg = new JumpGame();

        assertEquals(false, jg.canJumpRecursive(new int[] {1,4,1}, 4));
    }

    @Test
    public void testConditionTrueBackward() {
        var jg = new JumpGame();

        assertEquals(true, jg.canJumpBackWard(new int[] {1}));
        assertEquals(true, jg.canJumpBackWard(new int[] {0}));
        assertEquals(true, jg.canJumpBackWard(new int[] {3, 1}));
    }

    @Test
    public void canJumpBackward() {
        int[] num1 = new int[] {2,3,1,1,4};
        int[] num2 = new int[] {3,2,1,0,4};
        int[] num3 = new int[] {2,0};
        int[] num4 = new int[] {1,1,1,0};
        int[] num5 = new int[] {2,0,1,0,1};

        var jg = new JumpGame();
        assertEquals(true, jg.canJumpBackWard(num1));
        assertEquals(false, jg.canJumpBackWard(num2));
        assertEquals(true, jg.canJumpBackWard(num3));
        assertEquals(true, jg.canJumpBackWard(num4));
        assertEquals(false, jg.canJumpBackWard(num5));
    }

}