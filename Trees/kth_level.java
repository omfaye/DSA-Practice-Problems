//Sum at k th level of binary tree
public class kth_level 
{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static int sum = 0;
    public static void kLevel(Node node,int k,int level)
    {   
        
        if(node == null)
        {
            return;
        }
        if(k == level)
        {
            sum = sum+node.data;
        }

        kLevel(node.left, k, level+1);
        kLevel(node.right, k, level+1);
        
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int k=2;
        kLevel(root,k,0);
        System.out.println("The Sum at Level "+k+ " is " +sum);
      
    }
    
    
}

