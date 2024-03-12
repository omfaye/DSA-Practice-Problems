import java.util.*;
public class Directions {
    public static float Path()
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String = ");
        String str = sc.next();
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++)
        {

            if(str.charAt(i)=='W')
            {
                x--;
            }
            else if(str.charAt(i)=='N')
            {
                y++;
            }
            else if(str.charAt(i)=='E')
            {
                x++;
            }
            else{
                y--;
            }
        }
        int X = x*x;
        int Y = y*y;
        return (float)Math.sqrt(X+Y);

    }
    public static void main(String args[])
    {  
        System.out.println(Path());  
    }
}
