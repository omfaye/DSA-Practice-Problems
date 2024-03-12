import java.util.*;

public class PrimeInRange {
    public static void PrintPrime(int n) {
        int i = 2;
        while (i <= n) {
            if(n%i!=0){
            System.out.println(i);
            }
            i++;
        }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range to print prime numbers: ");
        int n = sc.nextInt();
        PrintPrime(n);
    }
}
