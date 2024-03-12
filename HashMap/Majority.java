import java.util.*;
public class Majority
{
     public static void main(String []args)
     {
        int nums[] = {1,2,1,1,3,2,1,2,1,1};
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                count = map.get(nums[i])+1;
                map.put(nums[i] , count);
            }
            else{
                map.put(nums[i] , 1);
            }
            
        }
        Set<Integer> key = map.keySet();
        for(Integer k : key)
        {
            if(map.get(k) > n/4)
            {
                System.out.print(k + " ");
            }
        }
        
        
     }
}