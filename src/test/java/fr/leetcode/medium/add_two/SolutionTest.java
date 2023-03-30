package fr.leetcode.medium.add_two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {
    @Test
    public void test() {
        var node = new ListNode(2, new ListNode(4, new ListNode(3)));
        var node2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        var solution = new Solution();
        var s = solution.addTwoNumbers(node, node2);
        var expected = new ListNode(7, new ListNode(0, new ListNode(8)));
        assertEquals(expected.val, s.val);
        s = s.next;
        expected = expected.next;
        assertEquals(expected.val, s.val);
        expected = expected.next;
        s = s.next;
        assertEquals(expected.val, s.val);
    }
}