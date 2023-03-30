package fr.leetcode.lengthoflastword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testLengthOfLastWord() {
        var s = new Solution();
        var test1 = "Hello World";
        var test2 = "   fly me   to   the moon  ";
        var test3 = "luffy is still joyboy";
        assertEquals(5, s.lengthOfLastWord(test1));
        assertEquals(4, s.lengthOfLastWord(test2));
        assertEquals(6, s.lengthOfLastWord(test3));
    }

    @Test
    public void testLengthOfWord() {
        var s = new Solution();
        var test1 = "Hello";
        var test2 = "";
        assertEquals(5, s.lengthOfWords(test1));
        assertEquals(0, s.lengthOfWords(test2));
    }

    @Test
    public void testRetriveLastWord() {
        var s = new Solution();
        var test1 = "Hello World";
        var test2 = "   fly me   to   the moon  ";
        var test3 = "luffy is still joyboy";

        assertEquals("World", s.lengthOfLastWord(test1));
        assertEquals("moon", s.lengthOfLastWord(test2));
        assertEquals("joyboy", s.lengthOfLastWord(test3));
    }


}