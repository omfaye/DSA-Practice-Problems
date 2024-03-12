public class product_ex_self {

    public static void result(int number[])
    {
        int left[] = new int[number.length];
        left[0] = 1;
        for(int i=1;i<number.length;i++)
        {   
            left[i] = left[i-1]*number[i-1];

        }
        int right[] = new int[number.length];
        right[number.length-1] = 1;
        for(int j=number.length-2;j>-1;j--)
        {
            right[j] = number[j+1]* right[j+1];
        }

        int result[] = new int[number.length];
        for(int i=0;i<number.length;i++)
        {
            result[i]=left[i]*right[i];
        }
        
        System.out.print("[");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(" " + result[i] +" ");
        }
        System.out.print("]");
        
        
    }
    public static void main(String args[])
    {
        int number[] = {1,0,3,-1};
        result(number);
    }
}
