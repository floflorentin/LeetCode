package fr.leetcode.easy.merge_alternately;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @CsvSource(textBlock = """
            a, b, ab
            ab, cd, acbd
            ab, pqrs, apbqrs
            abc, def, adbecf
            abcd, efgh, aebfcgdh
            a, eeeeee, aeeeeee
            eeeeee, a, eaeeeee
            """)
    void mergeAlternately(String word1, String word2, String expected) {
        var solution = new Solution();
        assertEquals(expected, solution.mergeAlternately(word1, word2));
    }
}