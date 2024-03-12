public class Reverse {
    public static void reverse(int array[])
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("Reverse Number ");
        for(int i=array.length-1;i>=0;i--)
        {
            System.out.println(array[i]);
        }

    }
    public static void main(String[] args)
    {
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        reverse(array);
    }
}
