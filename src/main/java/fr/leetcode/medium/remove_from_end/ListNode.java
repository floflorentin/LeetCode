package fr.leetcode.medium.remove_from_end;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode createFromArrayOfValue(int[] values) {
        ListNode result = new ListNode(values[0]);
        ListNode current = result;
        for(int i: values) {
            current.next = new ListNode(i);
            current = current.next;
        }
        return result.next;
    }

    public static int[] convertToArray(ListNode listNode, int size) {
        var output = new int[size];
        var i = 0;
        while(listNode != null) {
            output[i++] = listNode.val;
            listNode = listNode.next;
        }
        return output;
    }
}