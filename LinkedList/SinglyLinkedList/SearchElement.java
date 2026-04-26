// this is a program to search the element in a given linked list.


package LinkedList.SinglyLinkedList;

public class SearchElement {
    class LinkedList{                        // we have to declare a class with static keyword, otherwise we have to initialize the outer object.
        class Node{
            int data;
            Node next;

            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
        }

        Node head = null;
        Node tail = null;
        int size = 0;
        
        public void insertFirst(int val)
        {
            Node node = new Node(val);
            node.next = head;
            head = node;

            if(tail == null)
            {
                tail = head;
            }
            size++;
        }

        public boolean Search(int value)
        {
            Node temp = head;

            while(temp != null)
            {
                if(temp.data == value)
                {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }

    public static void main(String[] args)
    {
        SearchElement S = new SearchElement();                  // when we dont declare a class with static keyword in the LinkedList,, then we have to initialize a object of ReverseList.
        LinkedList list = S.new LinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);

        boolean Str = list.Search( 110);

        System.out.println(Str);

    }
}
