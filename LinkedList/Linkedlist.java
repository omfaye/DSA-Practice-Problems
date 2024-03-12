public class Linkedlist
{   
    public static class Node
    {
        int data;
        Node next;
        
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    
    public void Addfirst(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        newnode.next = head;
        head=newnode;
    }
    
    public void print()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void Addmid(int index , int data)
    {
        int i = 0;
        Node temp = head;
        while(i < index-1)
        {
            temp = temp.next;
            i++;
        }
        Node newnode = new Node(data);
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public void reverse()
    {
        Node prev = null;
        Node curr = tail = head;
        Node next; 
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }
        head = prev; 
    }
    public static void main(String args[])
    {
        Linkedlist ll = new Linkedlist();
        ll.Addfirst(5);
        ll.Addfirst(4);
        ll.Addfirst(3);
        ll.Addfirst(2);
        ll.Addfirst(1);
        ll.print();
        ll.reverse();
        ll.print();
        
    }
}