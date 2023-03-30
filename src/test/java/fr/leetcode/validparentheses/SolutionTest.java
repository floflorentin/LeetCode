package fr.leetcode.validparentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void testSubStringParenthesesSimple() {
        Solution s = new Solution();
        assertEquals(false, s.isValid("()"));
    }

    @Test
    public void testIsSpecialCharacter() {
        Solution s = new Solution();
        assertEquals(true, s.isSpecialCharacter('('));
        assertEquals(true, s.isSpecialCharacter(')'));
        assertEquals(true, s.isSpecialCharacter('{'));
        assertEquals(true, s.isSpecialCharacter('}'));
        assertEquals(true, s.isSpecialCharacter('['));
        assertEquals(true, s.isSpecialCharacter(']'));
        assertEquals(false, s.isSpecialCharacter('a'));
        assertEquals(false, s.isSpecialCharacter('1'));
    }

    @Test
    public void testRemovingUselessCharactersEmptyResult() {
        Solution s = new Solution();
        assertEquals("", s.removingUselessCharacters("azertyujyhfgdsqfhbodhbodmbhdfmbhdobdb"));
        assertEquals("", s.removingUselessCharacters("15687945678+9457894567+98456894" +
                "567894+8"));
    }

    @Test
    public void testRemovingUselessCharacters() {
        Solution s = new Solution();
        assertEquals("(", s.removingUselessCharacters("aaa ( aaaa"));
        assertEquals("(){}[]", s.removingUselessCharacters("a(a)a{a}a[a]"));
    }

    @Test
    public void testCompareStartAndEndOfString() {
        Solution s = new Solution();
        assertEquals(true, s.compareStartAndEndOfString("()"));
    }

    @Test
    public void testCompareStartAndEndOfStringWrongResult() {
        Solution s = new Solution();
        assertEquals(false, s.compareStartAndEndOfString("("));
        assertEquals(false, s.compareStartAndEndOfString("(("));
        assertEquals(false, s.compareStartAndEndOfString("["));
        assertEquals(false, s.compareStartAndEndOfString("[["));
        assertEquals(false, s.compareStartAndEndOfString("{{{[]}}"));
        assertEquals(false, s.compareStartAndEndOfString("()((()))))"));
    }
}