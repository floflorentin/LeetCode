package fr.leetcode.easy.remove_duplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

     @Test
    public void test() {
         var solu = new Solution();
         int[] arr = new int[] {1,1,2};
         var expected = 2;
         var arrExpected = new int[] {1,2,1};
         assertArrayEquals(arrExpected, arr);
     }
}