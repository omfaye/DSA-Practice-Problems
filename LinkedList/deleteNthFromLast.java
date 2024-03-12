//flipkart , Amazon , Qualcomm

//Delet Nth node from last index
import java.util.*;
public class deleteNthFromLast {
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
    
    public void addfirst(int data)
    {
        Node newnode = new Node();
        if(head==null)
        {   
            newnode.data = data;
            head = tail = newnode;
            return;
        }
        newnode.data = data;
        newnode.next = head;
        head = newnode;
        
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
    public void deleteFromLast(int index)
    {
        int size =0;
        Node temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            size++;
        }
        if(index==size)
        {
            head = head.next;
            return ;
        }
        Node prev = head;
        int i=1;
        while(i < size-index)
        {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        
    }
    
    public static void main(String args[])
    {
        deleteNthFromLast ll = new deleteNthFromLast();
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);
        ll.addfirst(6);
        ll.addfirst(7);
        ll.print();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index Number from last to delete: ");
        int index = sc.nextInt();
        ll.deleteFromLast(index);
        ll.print();
    }
}
