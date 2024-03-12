public class MergeSort {
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
            newnode.next = null;
            head = tail = newnode;
        }
        newnode.data = data;
        head = newnode;
    }

    public void printll()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) 
    {   
        MergeSort ll = new MergeSort();
        ll.Addfirst(1);
        ll.Addfirst(2);
        ll.Addfirst(3);
        ll.Addfirst(4);
        ll.printll();
        
    }
}
