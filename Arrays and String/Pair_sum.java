import java.util.ArrayList;
public class Pair_sum {

    //brute force 1 O(n^2)
    // public static ArrayList<Integer> pairSum(ArrayList<Integer> list , int target)
    // {   
    //     for(int i=0; i<list.size()  ; i++)
    //     {
    //         for(int j=i+1; j<list.size(); j++)
    //         {
    //             if(list.get(i) + list.get(j) == target)
    //             {
    //                 ArrayList<Integer> pair = new ArrayList<>();
    //                 pair.add(i);
    //                 pair.add(j);
    //                 return pair;
    //             }
    //         }
    //     }

    //     return null;
    // }

    //O(n) time complexity
    public static ArrayList<Integer> pair_sum(ArrayList<Integer> list,int target)
    {
        int left = 0;
        int right = list.size()-1;

        while(left<right)
        {
            if(list.get(left) + list.get(right) == target)
            {
                ArrayList<Integer> sum = new ArrayList<>();
                sum.add(left);
                sum.add(right);
                return sum;
            }
            else if(list.get(left) + list.get(right) > target)
            {
                right--;
            }
            else
            {
                left++;
            }
            
        }
        return null;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList <>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(pair_sum(list , target));
    }
}
