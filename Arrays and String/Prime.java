import java.util.*;
public class Prime {
    public static boolean isPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            {   
                isPrime=false;
                break;  
            }
        }
        return isPrime;
    }
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        if(isPrime(n)==true){
        System.out.print("The Number is Prime");
        }
        else{
            System.out.print("The Number is not Prime");
        }
    }
}
