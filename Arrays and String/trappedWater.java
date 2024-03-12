public class trappedWater {
    public static int waterTrap(int nums[])
    {
        //leftmax - array

        int leftMax[] = new int[nums.length];
        leftMax[0] = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            leftMax[i] = Math.max(nums[i], leftMax[i-1]);
        }

        //rightmax - array

        int rightMax[] =  new int[nums.length];
        rightMax[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2;i>=0 ;i--)
        {
            rightMax[i] = Math.max(nums[i], rightMax[i+1]);
        } 
        
        //min - leftmax,rightmax
        int trapWater = 0;
        for(int i=0;i<nums.length;i++)
        {
        //waterlevel = min - barheight
        int waterLevel = Math.min(leftMax[i],rightMax[i]) - nums[i];
        //sum up
        trapWater +=waterLevel ; 
        }
    
        return trapWater;

    }
    public static void main(String args[])
    {
        int nums[] = {4,2,0,6,3,2,5};
        System.out.println(waterTrap(nums));

    }
}
