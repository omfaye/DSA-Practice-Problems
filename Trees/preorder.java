//Preorder code in java
public class preorder 
{
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left = null;
            this.right= null;
        }
    }
    
    static class BinaryTree
    {   
        static int idx = -1;
        static Node trees(int Nodes[])
        {   
            idx++;
            if(Nodes[idx] == -1)
            {
                return null;
            }
            Node Newnode = new Node(Nodes[idx]);
            Newnode.left = trees(Nodes);
            Newnode.right = trees(Nodes);

            return Newnode;
        }
        static void preorderTraverse(Node root)
        {   
            if(root == null)
            {
                return ;
            }
            System.out.print(root.data+" ");
            preorderTraverse(root.left);
            preorderTraverse(root.right);
        }
    }
    public static void main(String[] args) 
    {
        int Nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.trees(Nodes);
        tree.preorderTraverse(root);
    }
}
