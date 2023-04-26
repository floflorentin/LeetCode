package fr.leetcode.easy.add_digits;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @CsvSource(textBlock = """
            38,2
            11,2
            0,0
            10,1
            9,9
            27,9
            """)
    void testLeetCodeExamples(int input, int output) {
        var solution = new Solution();
        assertEquals(output, solution.addDigits(input));
    }
}