import java.util.*;
public class Main
{
    public static class Node
    {
        int data;
        Node left,right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void getPath(Node root,int n,ArrayList<Node> path)
    {
        if(root == null)
        {
            return;
        }
        path.add(root);
        if(root.data == n)
        {
            return;
        }
        getPath(root.left,n,path);
        path.remove(path.size()-1);
        
    }
    public static void main(String args[])
    {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        
        int n1 = 5;
        int n2 = 4;
        getPath(root,n1,path1);
        
        for(int i=0;i<path1.size();i++)
        {
            System.out.println(path1.get(i).data+" ");
        }
        
        
        
    }
    
    
}