// this is a program to find the intersection in the given lists.
// if anyone of the lists are null, then return null.
// here we have to compare the nodes not node's value.
// Traverse both lists:
// if one pointer reaches to the end , then move to the another list.
// if both a and b equals, then return a.

// time complexity : O(n + m).
// space complexity : O(n).


package LinkedList.SinglyLinkedList;

public class IntersectionOfNode {
    static class ListNode{
        int data;
        ListNode next;

        ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
        {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        if(a != b)
        {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }
}
