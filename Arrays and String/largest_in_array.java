import java.util.*;
public class largest_in_array {
    public static int largest(int array[])
    {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<min)
            {
                min = array[i];
            }
        }
        return min;

    }
    public static void main(String[] args) {
        int array[] = {2,3,4,5,6,7,8,9};
       System.out.print("The Smallest in the array = "+largest(array));
}
}