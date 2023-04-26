package fr.leetcode.medium.smallest_infinite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmallestInfiniteSetTest {
    @Test
    void testLeetCodeTest() {
        var smallestSet = new SmallestInfiniteSet();
        assertEquals(1, smallestSet.popSmallest());
        assertEquals(2, smallestSet.popSmallest());
        smallestSet.addBack(1);
        assertEquals(1, smallestSet.popSmallest());
        assertEquals(3, smallestSet.popSmallest());
        smallestSet.addBack(2);
        assertEquals(2, smallestSet.popSmallest());
    }

    @Test
    void testLeetCodeTest2() {
        var smallestSet = new SmallestInfiniteSet();
        assertEquals(1, smallestSet.popSmallest());
        assertEquals(2, smallestSet.popSmallest());
        smallestSet.addBack(3);
        assertEquals(3, smallestSet.popSmallest());
        smallestSet.addBack(2);
        assertEquals(2, smallestSet.popSmallest());
        assertEquals(4, smallestSet.popSmallest());
    }

}