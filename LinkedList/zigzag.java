public class zigzag
{
    public class Node
    {
        int data;
        Node next;
        public void Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    
    public void Addfirst(int data)
    {
        Node newnode = new Node();
        if(head==null)
        {
            newnode.data=data;
            head = tail = newnode;
            return;
        }
        newnode.data=  data;
        newnode.next = head;
        head = newnode;
    }
    
    public void printll()
    {
        Node temp;
        temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
            
        }
        System.out.println("null");
    }
    
    public Node mid()
    {
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return slow;
    }
    public void zigZag()
    {
        Node midElement = mid();
        Node right = midElement.next;
        midElement.next = null;
        Node current = right;
        Node prev = null;
        Node next;
        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        Node lefthead = head;
        Node righthead = prev;
        Node nextL;
        Node nextR;
        while(lefthead!=null && righthead!=null)
        {
            nextL = lefthead.next;
            lefthead.next = righthead;
            nextR = righthead.next;
            righthead.next = nextL;
            lefthead = nextL;
            righthead = nextR;
        }
    }
    
    public static void main(String args[])
    {
        zigzag ll = new zigzag();
        ll.Addfirst(6);
        ll.Addfirst(5);
        ll.Addfirst(4);
        ll.Addfirst(3);
        ll.Addfirst(2);
        ll.Addfirst(1);
        ll.printll();
        ll.zigZag();
        ll.printll();
    
        
    }
}