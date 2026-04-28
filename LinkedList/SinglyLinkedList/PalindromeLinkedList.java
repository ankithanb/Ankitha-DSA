// this is a program to find the given linked list is palindrome or not..
// first, we have to find the middle element.
// second, from middle element, we have to reverse it.
// third, we have to compare those both lists.
// if both are same, then return true,, else return false;

package LinkedList.SinglyLinkedList;

class PalindromeLinkedList {
    static class ListNode{
        int data;
        ListNode next;

        ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public boolean isPalindrome(ListNode head) {
        // Find the middle element.
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse from middle element.
        ListNode prev = null;
        while(slow != null)
        {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Compare those lists means first half and second reversed half.
        ListNode first = head;
        ListNode second = prev;

        while(second != null)
        {
            if(first.data != second.data)
            {
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }
}