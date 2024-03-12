import java.util.*;
public class Print1to10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        boolean prime = true;
        if(n==2){
            System.out.println("prime number");
        }
        else{
        for(int i=2;i<=n-1;i++)
        {   
            if(n%i==0)
            {
                prime=false;
            }
        }
        if(prime==true)
        {
            System.out.println("prime number");
        }
        else
        {
            System.out.println("Not prime number");
        }
    }
    }
}