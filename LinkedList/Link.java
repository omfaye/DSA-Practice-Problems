//stack implementation using java
public class Link
{
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    
    static class Stack
    {
        static Node head = null;
        public static boolean isEmpty()
        {
            return head==null;
        }
        
        public static void push(int data)
        {   
            Node newnode = new Node(data);
            if(isEmpty())
            {
                head = newnode ;
                return;
            }
            newnode.next = head;
            head = newnode;
        }
        
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;    
        }
        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return head.data;
        }
        
    }
    public static void main(String args[])
    {   
        Link l = new Link();
        Stack ll = new Stack();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        while(!ll.isEmpty())
        {
            System.out.println(ll.peek());
            ll.pop();
        }
        
    }
}