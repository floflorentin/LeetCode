package fr.leetcode.easy.merge_two_lists;

import java.util.Objects;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode current1 = list1;
        ListNode current2 = list2;
        ListNode result = new ListNode(0);
        ListNode currentResult = result;
        while(!Objects.isNull(current2) && !Objects.isNull(current1)) {
            if(current2.val > current1.val) {
                currentResult.next = new ListNode(current1.val);
                current1 = current1.next;
            } else {
                currentResult.next = new ListNode(current2.val);
                current2 = current2.next;

            }
            currentResult = currentResult.next;
        }
        if(Objects.isNull(current2)) {
            currentResult.next = current1;
        } else if(Objects.isNull(current1)) {
            currentResult.next = current2;
        }
        return result.next;
    }
}

