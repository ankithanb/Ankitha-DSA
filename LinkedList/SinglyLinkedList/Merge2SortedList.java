package LinkedList.SinglyLinkedList;

class Merge2SortedList {
    static class ListNode{
        int data;
        ListNode next;

        ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while(list1 != null && list2 != null)
        {
            if(list1.data <= list2.data)
            {
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if(list1 != null)
        {
            temp.next = list1;
        }
        else{
            temp.next = list2;
        }

        return dummy.next;
    }
}

