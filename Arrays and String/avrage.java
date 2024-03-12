import java.util.*;
public class avrage {
    public static int avarage(int a,int b,int c)
    {
        return (a+b+c)/3;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print("The avarage of 3 numbers :"+avarage(a,b,c));
    }
}
