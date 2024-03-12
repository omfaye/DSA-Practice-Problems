//accenture 
public class CheckPassword
{
    public static int CheckPassword(char str[], int n)
    {
        if(str.length <4)
        {
            return 0;
        }
        if(Character.isDigit(str[0]))
        {
            return 0;
        }
        
        boolean hasDigit = false;
        boolean hasCapital = false;
        for(int i=0;i<n;i++)
        {
            if(Character.isDigit(str[i]))
            {
                hasDigit = true;
            }
            if(Character.isUpperCase(str[i]))
            {
                hasCapital = true;
            }
            if(str[i] == ' ' ||str[i] =='/')
            {
                return 0;
            }
        }
        if(hasDigit && hasCapital)
        {
            return 1;
        }
        return 0;
        
    }
    public static void main(String []args){
        String s = "aAB18A";
        char str[] = s.toCharArray(); 
        int n = str.length;
        System.out.println(CheckPassword(str, n));
        
     }
}