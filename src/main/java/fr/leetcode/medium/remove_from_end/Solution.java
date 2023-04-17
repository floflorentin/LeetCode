package fr.leetcode.medium.remove_from_end;

import java.util.Objects;

class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode firstElement = new ListNode(0);
        firstElement.next = head;
        ListNode first = firstElement;
        ListNode second = firstElement;
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
            if (first == null) {
                break;
            }
        }
        while (!Objects.isNull(first)) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return firstElement.next;
    }
}