import java.util.*;

public class array{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        int number[]={1,2,3,4,52,83,91,92,73,119};

        int largest = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++)
        {
        if(number[i]>largest)
        {
            largest = number[i];
        }
        
        }

        System.out.println(largest);
        
    }
}