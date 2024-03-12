public class rec_factorial 
{
    public static int Factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int fact = n*Factorial(n-1);
        return fact;
    }
    public static void main(String args[])
    {
        System.out.println(Factorial(5));

    }
}
