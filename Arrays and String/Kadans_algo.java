
public class Kadans_algo
{   
    public static int kadans(int nums[])
    {   
        int cs=0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            cs+=nums[i];
            if(cs<0)
            {
                cs=0;
            }
            max=Math.max(cs,max);
        }


        return max;
    }
    public static void main(String args[])
    {
        int nums[] = {-2,-3,-1,-2,-3};
        System.out.println(kadans(nums));
    }
}