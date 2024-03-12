import java.util.*;
public class Recursionbasic
{
    public static void increase(int num)
    {   
        
        if(num==10)
        {
            System.out.println(10);
            return ;
        }
        System.out.println(num);
        increase(num+1);
    }
    public static void main(String args[])
    {
        increase(1);
    }

}