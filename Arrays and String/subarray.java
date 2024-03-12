public class subarray {
    public static void subarray(int array[]){
        for(int i=0;i<array.length;i++)
        {
        
            for(int j=i;j<array.length;j++)
            {
                for(int k=i;k<j;k++)
                {
                    System.out.print(array[k]+"");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int array[]={1,2,3,4,5};
        subarray(array);
        
    }
}
