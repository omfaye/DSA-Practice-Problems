import java.util.*;
public class fib 
{   
    public static int fib(int n,int num[])
    {   
        if(n==0 || n==1) 
        {
            return n;
        }
        if(num[n]!=0 )
        {                   
            return num[n];  //memoization is the store something in the memory or advance recursion
        }
        num[n] = fib(n-1,num)+fib(n-2,num);
        return num[n];
    }
    public static void main(String[] args) 
    {
        int n = 11;
        int num[] = new int[n+1];
        System.out.println(fib(n,num));
    }
}
