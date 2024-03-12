import java.util.*;
public class create
{   
    static class Node
    {
        Node children[] = new Node[26];
        boolean endOfWord;
        Node()
        {
            endOfWord = false;
            for(int i=0; i<children.length; i++)
            {
                children[i] = null;
            }
        }
    }

    static Node root = new Node();

    
    public static void insert(String word) //time complexity O(L) (L:length of words)
    {
        Node curr = root;   
        for(int i=0;i<word.length();i++)
        {
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null)
            {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.endOfWord = true;  

    }

    public static boolean search(String word)
    {      
        Node temp = root;
        for(int i=0;i<word.length();i++)
        {   
            int idx = word.charAt(i) - 'a';
            if(temp.children[idx] == null)
            {
                return false;
            }   
            temp = temp.children[idx];
        }
        return temp.endOfWord;
        
    }
    public static void main(String[] args) 
    {
        String str[] = {"the","there","their","a","any"};
        for(int i=0;i<str.length;i++)
        {
            insert(str[i]);
        }
        
        System.out.println(search("the"));
        

    }
}