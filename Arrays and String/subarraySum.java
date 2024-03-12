public class subarraySum {
    public static void subarraysum(int array[])
    {
        int max=Integer.MIN_VALUE;
    
        for(int i=0;i<array.length;i++)
        {
            for(int j=i;j<array.length;j++)
            {   
                int current=0;
                for(int k=i;k<=j;k++)
                {
                    current = current + array[k];
                }
                System.out.println(current);
                if(max<current)
                {
                    max = current;
                }
                
            }

        }
        System.out.println("Max: "+max);
    }
    public static void main(String args[])
    {
        int array[]={1,2,3,4};
        subarraysum(array);


    }
}
