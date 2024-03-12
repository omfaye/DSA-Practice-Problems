public class zero_one_triangle {
    public static boolean printEvenOdd(int a , int b)
    {   
        if((a+b) % 2 == 0) // here if you not add brackets to the a +b the your answer gives zeros  
                    // because modulo is higher precedance than brackets 
        {   
            return true;  
        }
        return false;
    }
    public static void triangle()
    {
        for(int i=1;i<6;i++)
        {
            for(int j=1; j<=i ; j++)
            {
                if(printEvenOdd(i,j))
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        triangle();
    }
}