package fr.leetcode.easy.havles_alike;

import fr.leetcode.easy.havles_alike.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


     @Test
    public void testSum() {
         var s1 = "book";
         var s2 = "textbook";

         var solution = new Solution();

         assertEquals(true, solution.halvesAreAlike(s1));
         assertEquals(false, solution.halvesAreAlike(s2));

     }

     @Test
    public void testVoyelles() {
         var s1 = 'a';
         var s2 = 'b';
         var s3 = 'A';

         var solution = new Solution();
         assertEquals(true, solution.isVoyelle(s1));
         assertEquals(false, solution.isVoyelle(s2));
         assertEquals(true, solution.isVoyelle(s3));
     }

     @Test
    public void testMerry() {
         var merry = "MerryChristmas";
         var solution = new Solution();
         assertEquals(false, solution.halvesAreAlike(merry));
     }
}