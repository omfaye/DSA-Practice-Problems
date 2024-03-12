import java.util.*;
public class Bin_Dec {
    public static int bin_dec(int n)
    {   
        int pow=0;
        int dec=0;
        int lastdigit;
        while(n>0)
        {
            lastdigit = n%10;
            dec= dec + (lastdigit*(int)Math.pow(2,pow));
            n=n/10;
            pow++; 
        }
        return dec;
    }
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(bin_dec(n));
    }
    
}
