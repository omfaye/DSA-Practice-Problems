//Level Order Traversal
import java.util.*;
public class Level_Order 
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
        
        static void Level_OrderTraverse(Node root)
        {   
            if(root==null)
            {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
          
            while(!q.isEmpty())
            {      
                Node currNode = q.remove();
                if(currNode == null)
                {
                    System.out.println();
                    if(q.isEmpty())
                    {   
                        break;
                    }
                    else
                    {
                        q.add(null);
                    }
                } 
                else
                {
                    System.out.print(currNode.data+" ");
                    if(currNode.left !=null)
                    {
                        q.add(currNode.left);
                    }
                    if(currNode.right !=null)
                    {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        int Nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.trees(Nodes);
        tree.Level_OrderTraverse(root);
        
    }
}
