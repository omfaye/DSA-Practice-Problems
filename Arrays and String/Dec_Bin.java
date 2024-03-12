import java.util.*;
public class Dec_Bin {
    public static void Dec_bin(int n)
    {
        int pow=0;
        int bin=0;
        while(n>0)
        {
            int r=n%2;
            bin=bin+r*(int)Math.pow(10,pow);
            pow++;
            n=n/2;
        }
        System.out.println(bin);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Dec_bin(n);
}
}
