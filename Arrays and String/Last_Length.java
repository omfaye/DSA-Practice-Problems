//length of last word in a string 
public class Solution {
    public static int lengthOfLastWord(String s) 
    {  
        int count = 0;
        int j = s.length()-1;
        
        while(j>=0 && s.charAt(j) == ' ')
        {
            j--;
        }
        
        while(j>=0)
        {   
            if(s.charAt(j) == ' ')
            {   
                break;
            }  
            count = count+1;
            j--;
        }
       return count;
    }
    public static void main(String args[])
    {
        String s = "  Hello World  name is faye ";
        System.out.println(lengthOfLastWord(s));
    }
}