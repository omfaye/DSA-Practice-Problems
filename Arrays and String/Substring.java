public class Substring
{   
    public static void findsub(String str,int index ,String ans)
    {   
        
        if(index == str.length())
        {   
            if(ans.length() == 0)
            {
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            
            return;
        }
        
        findsub(str , index+1 , ans+str.charAt(index));
        findsub(str , index+1 , ans);
        
    }
    
    public static void main(String args[])
    {
        String str = "abc";
        String ans = "";
        findsub(str,0,ans);
        
    }
}