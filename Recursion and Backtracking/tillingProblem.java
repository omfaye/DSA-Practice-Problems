public class tillingProblem
{
    public static int tp(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        
        int nm1 = tp(n-1);
        int nm2 = tp(n-2);
        int total = nm1 + nm2;
        return total;
    }
    public static void main(String args[])
    {
        int n = 4;
        System.out.println(tp(n));
    }
}