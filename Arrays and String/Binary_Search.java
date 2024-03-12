//Time complexity: O(log n)
public class Binary_Search {
    public static int search(int array[],int key)
    {
        int start=0;
        int end=array.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(array[mid]==key)
            {
                return mid;
            }
            if(array[mid]>key)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int array[]={1,2,3,4,5,6,7,8};
        int key = 9;
        System.out.println(search(array,key));
    }
}
