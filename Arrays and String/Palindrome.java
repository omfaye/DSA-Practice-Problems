import java.util.*;
public class palindrome {
    public static void palindrome(int n)
    {
        int sample=n;
        int rem =0;
        while(n>0)
        {
            int r=n%10;
            rem=rem*10+r;
            n = n/10; 
        }
        if(sample==rem)
        {
            System.out.print("Palindrome Number");
            
        } 
        else{
            System.out.print("Not Palindrome Number");
            
        } 
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        palindrome(n);
    }
}
