//build BST
import java.util.*;

public class BST {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);

    }
    
    //search 

    public static boolean search(Node root,int key)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data == key)
        {
            return true;
        }

        if(root.data>key)
        {
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
        
    }

    public static void printPath(ArrayList<Node> path)
    {
        for(int i=0;i<path.size();i++)
        {
            System.out.print(path.get(i).data+"->");
        }
        System.out.println("N");
    }
    public static void getPath(Node root , int n , ArrayList<Node> path)
    {   
        if(root == null)
        {
            return ;
        }
        path.add(root);
        
        if(root.left == null && root.right == null)
        {
            printPath(path);
        }
        getPath(root.left, n, path);
        getPath(root.right, n, path);
        path.remove(path.size()-1);
    }    
    

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.left.left = new Node(6);
        root.right.right = new Node(7);
    
        getPath(root, 4, new ArrayList<>());
    }
}
