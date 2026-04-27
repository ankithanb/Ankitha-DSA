package LinkedList.SinglyLinkedList;

class DeleteMiddleItem {
    static class ListNode{
        int data;
        ListNode next;

        ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode deleteMiddle(ListNode head) {
        if(head != null || head.next != null)
        {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        while(fast != null && fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;
        
        return head;
    }
}
