package LinkedList.SinglyLinkedList;

public class SearchElement {
    class LinkedList{
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
        SearchElement S = new SearchElement();
        LinkedList list = S.new LinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);

        boolean Str = list.Search( 110);

        System.out.println(Str);

    }
}
