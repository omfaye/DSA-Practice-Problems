//Binomial Coefficients nCr calculation
import java.util.*;
public class Product
{  
    public static int factorial(int n)
    {   
        int fact=1;
        for(int i = 1; i <=n; i++)
        {
            fact=fact*i;
        }
        return fact;
    } 
    public static int bincoe(int n,int r)
    {
        int nfact=factorial(n);
        int rfact=factorial(r);
        int n_rfact = factorial(n-r);
        int bincoe = nfact/(rfact*n_rfact);
        return bincoe;
    }
    
    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
       System.out.print(bincoe(n,r));
    }
}