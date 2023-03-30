package fr.leetcode.medium.add_two;

import java.util.Objects;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        var str = new StringBuilder();
        str.append(val);
        var node = this.next;
        while (!Objects.isNull(node)) {
            str.append(" >>> ")
                    .append(node.val);
            node = node.next;
        }
        return str.toString();
    }
}
