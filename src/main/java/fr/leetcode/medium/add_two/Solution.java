package fr.leetcode.medium.add_two;

import java.util.Objects;

/**
 * <a href="https://leetcode.com/problems/add-two-numbers/">add-two-numbers</a>
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return getNode(l1, l2, 0);
    }

    private ListNode getNode(ListNode l1, ListNode l2, int retenu) {
        if(Objects.isNull(l1)) {
            if(Objects.isNull(l2)) {
                if(retenu != 0) {
                    return new ListNode(retenu, null);
                }
                return null;
            }
            l1 = new ListNode(0);
        } else if(Objects.isNull(l2)) {
            l2 = new ListNode(0);
        }
        int result = l1.val + l2.val;
        if(result + retenu >= 10) {
            return new ListNode(result - 10 + retenu, getNode(l1.next, l2.next, 1));
        }
        return new ListNode(result + retenu, getNode(l1.next, l2.next, 0));
    }

}
