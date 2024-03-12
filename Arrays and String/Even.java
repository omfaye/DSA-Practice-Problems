import java.util.*;
public class Even {
    public static boolean isEven(int n)
    {
        boolean isEven = true;
            if(n%2!=0)
            {
                isEven = false;
                return isEven;
            }
        return isEven;
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print(isEven(n));

    }
}
