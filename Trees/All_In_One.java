import java.util.*;
public class All_In_One 
{ 
    static class Node
    {
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

    public static class Binary_tree
    { 
        static int idx = -1;
        static Node Build_Tree(int Nodes[])
        {   
            idx++;  
            if(idx >= Nodes.length || Nodes[idx] == -1)
            {
                return null;
            }
            
            Node Newnode = new Node(Nodes[idx]);
            Newnode.left = Build_Tree(Nodes);
            Newnode.right = Build_Tree(Nodes);

            return Newnode;
        }

        static void preorder(Node root)
        {
            if(root == null)
            {
                return ;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        static void postorder(Node root)
        {   
            if(root == null)
            {
                return ;
            }
            
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
            
        }

        static void inorder(Node root)
        {   
            if(root == null)
            {
                return ;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
            
        }
    }
    public static void main(String args[]) 
    {
        int Nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary_tree tree = new Binary_tree();
        Node root = tree.Build_Tree(Nodes);
        Scanner sc = new Scanner(System.in);
        char ch;
        do
        {
            System.out.print("1.Preorder\n2.Inorder\n3.PostOrder\n");
            System.out.print("Enter the choice: ");
            int n = sc.nextInt();
            switch (n) 
            {
                case 1:
                    tree.preorder(root);
                    break;
                case 2:
                    tree.inorder(root);
                    break;
                case 3:
                    tree.postorder(root);
                    break;
            
                default:
                    System.out.println("Not Found Entered Wrong!");
                    break;
            }
            System.out.println();
            System.out.print("Do You want to Continue (y/n): ");
            ch = sc.next().charAt(0);


        }while(ch=='y');
    

    }

}
