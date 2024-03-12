import java.util.*;
public class Solution {
    public static ListNode reverseBetween(ListNode head, int left, int right,LinkedList<Integer> ll)
    {
        
        ListNode temp = head;
        ListNode prev = null;
        while(temp.val != left)
        {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        ListNode temp2 = temp.next;
        ListNode right_ptr = temp;
        while(right_ptr.val != right)
        {
            right_ptr = right_ptr.next;
            temp2 = temp2.next;
        }
        right_ptr.next = null;

        ListNode current = temp;
        ListNode previous = null;
        ListNode next = temp;
        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        prev.next = current;
        temp.next = temp2;

        return head;

        }
        public static void main(String[] args) {
            LinkedList<Integer> ll = new LinkedList();
            ll.addfirst(1);
            ll.addfirst(2);
            ll.addFirst(3);
            ll.addFirst(4);
            ll.addFirst(5);
            

        }
    }
