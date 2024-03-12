public class FirstOccurence
{
    public static int getFirstOccurrence(int arr[],int key , int i)
    {
        if(i==arr.length-1)
        {
            return -1;
        }
        if(key==arr[i])
        {
            return i;
        }
        return getFirstOccurrence(arr, key, i+1);
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,5,5};
        System.out.println(getFirstOccurrence(arr, 5, 0));
    }
}