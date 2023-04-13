package fr.leetcode.easy.merge_two_lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void mergeTwoLists() {
        var solution = new Solution();
        var list1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(4)));
        var list2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4)));
        var output = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4)))))));
        assertEquals(output, solution.mergeTwoLists(list1, list2));
    }

}