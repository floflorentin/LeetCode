package fr.leetcode.medium.remove_from_end;

import org.junit.jupiter.api.Test;

import static fr.leetcode.medium.remove_from_end.ListNode.convertToArray;
import static fr.leetcode.medium.remove_from_end.ListNode.createFromArrayOfValue;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void removeFromEndOfList() {
        var solution = new Solution();
        var input = new int[] {1,2,3,4,5};
        var head = createFromArrayOfValue(input);
        var result = solution.removeNthFromEnd(head, 2);
        var output = convertToArray(result, input.length - 1);
        var expected = new int[] {1,2,3,5};
        assertArrayEquals(expected, output);
    }

    @Test
    void removeFromEndOfListLongest() {
        var solution = new Solution();
        var input = new int[] {1,2,3,4,5,6,7,8,9,10};
        var head = createFromArrayOfValue(input);
        var result = solution.removeNthFromEnd(head, 4);
        var output = convertToArray(result, input.length - 1);
        var expected = new int[] {1,2,3,4,5,6,8,9,10};
        assertArrayEquals(expected, output);
    }

    @Test
    void removeFromEndOfListShortest() {
        var solution = new Solution();
        var input = new int[] {1,2};
        var head = createFromArrayOfValue(input);
        var result = solution.removeNthFromEnd(head, 2);
        var output = convertToArray(result, input.length - 1);
        var expected = new int[] {2};
        assertArrayEquals(expected, output);
    }

    @Test
    void removeFromEndOfListShortestAtMid() {
        var solution = new Solution();
        var input = new int[] {1,2,3};
        var head = createFromArrayOfValue(input);
        var result = solution.removeNthFromEnd(head, 2);
        var output = convertToArray(result, input.length - 1);
        var expected = new int[] {1,3};
        assertArrayEquals(expected, output);
    }

    @Test
    void removeFromEndOfListShortestAtEnd() {
        var solution = new Solution();
        var input = new int[] {1,2};
        var head = createFromArrayOfValue(input);
        var result = solution.removeNthFromEnd(head, 1);
        var output = convertToArray(result, input.length - 1);
        var expected = new int[] {1};
        assertArrayEquals(expected, output);
    }

    @Test
    void removeFromEndOfListLongestBIG() {
        var solution = new Solution();
        var input = new int[] {1,2,3,4,5,6,7,8,9,10};
        var head = createFromArrayOfValue(input);
        var result = solution.removeNthFromEnd(head, 1);
        var output = convertToArray(result, input.length - 1);
        var expected = new int[] {1,2,3,4,5,6,7,8,9};
        assertArrayEquals(expected, output);
    }
    @Test
    void removeFromEndOfListLongestAtMid() {
        var solution = new Solution();
        var input = new int[] {1,2,3,4,5,6,7,8,9,10};
        var head = createFromArrayOfValue(input);
        var result = solution.removeNthFromEnd(head, 6);
        var output = convertToArray(result, input.length - 1);
        var expected = new int[] {1,2,3,4,6,7,8,9,10};
        assertArrayEquals(expected, output);
    }

    @Test
    void removeFromEndOfListLongestBIG2() {
        var solution = new Solution();
        var input = new int[] {1,2,3,4,5,6,7,8,9,10};
        var head = createFromArrayOfValue(input);
        var result = solution.removeNthFromEnd(head, 10);
        var output = convertToArray(result, input.length - 1);
        var expected = new int[] {2,3,4,5,6,7,8,9,10};
        assertArrayEquals(expected, output);
    }

    @Test
    void createListNodeFromArray() {
        var input = new int[] {1,2,3,4,5};
        var listNode = createFromArrayOfValue(input);
        var output = convertToArray(listNode, input.length);
        assertArrayEquals(input, output);
    }

    @Test
    void convertToIntArray() {
        var input = new ListNode(1);
        var output = new int[] {1};
        assertArrayEquals(output, ListNode.convertToArray(input,1));
    }

    @Test
    void convertToIntArrayCase3Values() {
        var input = new ListNode(1, new ListNode(3, new ListNode(5)));
        var output = new int[] {1, 3, 5};
        assertArrayEquals(output, ListNode.convertToArray(input,3));
    }

}