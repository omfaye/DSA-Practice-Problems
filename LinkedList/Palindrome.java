//Palindrome Using LinkedList
public class Palindrome
{
    public static class Node
    {
        int data;
        Node next;
        public void Node(int data)
        {
            this.data = data;
            this.next = next;
        }
        
    }
    public static Node head;
    public static Node tail;
    
    public void Addfirst(int data)
    {   
        Node newnode = new Node();
        if(head == null)
        {
            newnode.data = data;
            head = tail = newnode;
            return ;
        }
        newnode.data = data;
        newnode.next = head;
        head = newnode;
        
    }
    
    public Node mid(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public boolean checkPalindrome()
    {
        Node mid = mid(head);
        Node curr = mid;
        Node prev = null;
        Node next;
        while(curr !=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        
        while(right!=null)
        {
            if(left.data != right.data)
            {
                return false;
            }
            left = left.next;
            right = right.next;
            
        }
        return true;
        
    }
    
    public void printll()
    {
        Node temp =head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static boolean hasCycle(Node head) 
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }   
        }
        return false;
    }
    public static void main(String args[])
    {
        Palindrome ll = new Palindrome();
        ll.Addfirst(1);
        ll.Addfirst(2);
        ll.Addfirst(1);
        
        ll.printll();
        System.out.println(ll.checkPalindrome());
        
        System.out.println(ll.hasCycle(head));
        
    }
}