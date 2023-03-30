package fr.leetcode.fizz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void Test() {
        var sol = new Solution();
        assertEquals(List.of("1", "2", "Fizz"), sol.fizzBuzz(3));
    }
}