package fr.leetcode.easy.longest_palindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @CsvSource(textBlock = """
            aaaaaaa,7
            a,1
            AAAAAA,6
            zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez,55
            """
    )
    void testSimple(String input, int output) {
        var solution = new Solution();
        assertEquals(output, solution.longestPalindrome(input));
    }
}