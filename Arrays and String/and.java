import java.util.*;
public class and
{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the binary number: ");
    int n = sc.nextInt();
    int bin=0,r,i=1;
    while(n!=0)
    {
        r = n%10;
        bin = bin+ r*i;
        i = i*10;
        n=n/10;
        
    }
    System.out.println("The Decimal Number is "+bin);
}

}