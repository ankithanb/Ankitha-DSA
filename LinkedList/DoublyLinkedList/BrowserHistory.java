// Time complexity : visit -> O(1)
//                   backward -> O(k)
//                   forward -> O(k)

// Space complexity : O(n) because we store each visited page as a node.

package LinkedList.DoublyLinkedList;

public class BrowserHistory {
    static class LinkedList{
        class ListNode{
            String url;
            ListNode prev, next;

            ListNode(String url)
            {
                this.url = url;
            }
        }

        ListNode curr;

        public LinkedList(String homepage)                  // Create a new page.
        {
            curr = new ListNode(homepage);
        }

        public void visit(String url)                      // visit to the particular web page.
        {
            ListNode node = new ListNode(url);

            curr.next = null;

            curr.next = node;
            node.prev = curr;

            curr = node;
        }
        
        public String backward(int steps)                  // go steps backward from current url.
        {
            while(steps > 0 && curr.prev != null)
            {
                curr = curr.prev;
                steps--;
            }
            return curr.url;
        }

        public String forward(int steps)                   // got steps forward from current url.
        {
            while(steps > 0 && curr.next != null)
            {
                curr = curr.next;
                steps--;
            }
            return curr.url;
        }
    }

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList("google.com");

        // list.visit("google.com");           // already visited to this page through constructor.. so dont visit again
        list.visit("facebook.com");
        list.visit("udemy.com");

        System.out.println(list.backward(1));
        System.out.println(list.backward(1));
        System.out.println(list.forward(2));
    }
}
