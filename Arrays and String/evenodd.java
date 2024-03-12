import java.util.*;
public class evenodd {

    public static void evenodd(int n)
    {
        int bitmask = 1;
        if( (n & bitmask) == 0)
        {
            System.out.print("Even");
        }
        else{
            System.out.print("Odd");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to check Even or Odd: ");
        int n = sc.nextInt();
        evenodd(n);

    }
}
