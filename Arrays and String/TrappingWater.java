import java.util.*;
public class TrappingWater {

    public static int trapping(int height[])
    {   
        int n =height.length;
        int maxleft[] = new int [n];
        maxleft[0] = height[0];
        for(int i=1; i<n; i++)
        {
            maxleft[i] = Math.max(maxleft[i-1],height[i]);
        }
        int maxright[] = new int [n];
        maxright[n-1] = height[n-1];
        for(int i=n-2; i>=0; i++)
        {
            maxright[i] = Math.max(maxright[i+1],height[i]);
        }
        int trappedwater = 0;
        for(int i=0;i<n;i++)
        {
            int waterlevel = Math.min(maxleft[i],maxright[i]);
            trappedwater+=waterlevel-height[i];
        }
        return trappedwater;

    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trapping(height));
    }
}
