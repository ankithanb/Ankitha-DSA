// this is a program to delete a duplicates from the given list.
// if head or head.next == null, then return head or null.
// we have to compare the current node data and current next node data, if both are same then we have to delete a same element.
// else move to the next node.

// time complexity : O(n).
// space complexity : O(1).


package LinkedList.SinglyLinkedList;

class Solution {
    static class ListNode{
        int data;
        ListNode next;

        ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
        {
            return null;
        }

        ListNode curr = head;
        while(curr.next != null)                         // if we didnt give the curr.next in this condition , then it will give error for undeclaring val ..(in the leetcode)
        {
            if(curr.data == curr.next.data)
            {
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }
}
