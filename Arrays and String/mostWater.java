//Container with most water 
import java.util.ArrayList;
public class mostWater {

    //O(n^2) time complexity
    // public static int most(ArrayList<Integer> list)
    // {   
    //     int maxWater = Integer.MIN_VALUE;
    //     for(int i=0; i<list.size(); i++)
    //     {
    //         for(int j=i+1 ; j<list.size() ; j++)
    //         {   
    //             int width = j-i;
    //             int height = Math.min(list.get(i),list.get(j));
    //             int Watercollect = width*height;
    //             if(maxWater < Watercollect) 
    //             {
    //                 maxWater = Watercollect;
    //             }
    //         }

    //     }
    //     return maxWater;
    // }

    // O(n) time complexity
    public static int storeWater(ArrayList<Integer> list)
    {
        int left = 0;
        int right = list.size()-1;
        int maxWater = Integer.MIN_VALUE;
        while(left<right)
        {
            int height = Math.min(list.get(left) , list.get(right));
            int width = right-left;
            int waterstore = height*width;
            maxWater = Math.max(maxWater, waterstore);
            if(left < right)
            {
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) 
    {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);  
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println("In a Container most water is stored is : "+ storeWater(list));

    }    
}
