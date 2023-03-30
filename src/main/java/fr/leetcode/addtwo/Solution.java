package fr.leetcode.addtwo;

import java.util.Objects;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //return getListNode(l1, l2);
        return getNode(l1, l2, 0);
    }

    private ListNode getListNode(ListNode l1, ListNode l2) {
        int retenu = 0;
        var node = new ListNode(0, null);
        var currentNode = node;
        while (!Objects.isNull(l1) && !Objects.isNull(l2)) {
            if(Objects.isNull(l1)) {
                l1.val = 0;
            } else if(Objects.isNull(l2)) {
                l2.val = 0;
            }
            var result = l1.val + l2.val;
            currentNode = currentNode.next;
            if(result + retenu >= 10) {
                result -= 10;
                currentNode = new ListNode(result + retenu, null);
                retenu = 1;
            } else {
                currentNode = new ListNode(result + retenu, null);
            }
            System.out.println("####" + currentNode.val);
            l1 = l1.next;
            l2 = l2.next;
        }
        System.out.println("Print node " + currentNode.toString());
        return currentNode;
    }

    public ListNode getNode(ListNode l1, ListNode l2, int retenu) {
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
