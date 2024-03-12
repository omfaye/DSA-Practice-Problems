//Reverse String using Stack
import java.util.*;
public class Reverse
{
    public static String reverseString(Stack<Character> s,String str)
    {
        int index = 0;
        while(index<str.length())
        {
            s.push(str.charAt(index));
            index++;
        }
        
        StringBuilder result = new StringBuilder("");
        while(s.isEmpty())
        {
            char curr=s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String args[])
    {
        String str = "abc";
        Stack<Character> s = new Stack<>();
        String Final = reverseString(s,str);
        System.out.println(Final);
    }
}