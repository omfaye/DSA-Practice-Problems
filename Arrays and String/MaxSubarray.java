public class MaxSubarray {
    public static void Max(int array[])
    {   
        int currentsum=0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++)
        {
            int start= i;
            for(int j=i;j<array.length;j++)
            {
                int end=j;
                currentsum=0;
                for(int k=start;k<=end;k++)
                {
                    currentsum+=array[k];
                    
                }
                System.out.println(currentsum);
                if(max<currentsum)
                {
                    max = currentsum;
                }
                
            }
            
        }
        System.out.println("Maximun of Subarrays:"+max);
    }
    public static void main(String args[])
    {
        int array[]={1,2,3};
        Max(array);
    }
}
