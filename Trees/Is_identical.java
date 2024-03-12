public class Is_identical 
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

    
    
    public static void main(String[] args) 
    {
        /*
         *              1
         *             / \
         *            2   3
         *           / \   \
         *          4   5   6
         */
        Node root = new Node(1);
        Node root.left = new Node(2);
        Node root.right = new Node(3);
        Node root.left.left = new Node(4);
        Node root.left.right = new Node(5);
        Node root.right.right = new Node(6);

        /*
         *              2
         *            /  \
         *           4    5 
         */
        Node newroot = new Node(2);
        Node newroot.left = new Node(4);
        Node newroot.right = new Node(5);
        
    }   
}
