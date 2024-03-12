import java.util.*;
public class PalinString {

    public static void palindrome(String str)
    {   
        
        int n = str.length();
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)!=str.charAt(n-1-i))
            {
                System.out.println("Not a palindrome");     
            }

        }
        System.out.println("Palindrome");
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a string: ");
        String str =sc.next();
        palindrome(str);
          
    }
}
