import java.util.ArrayList;
public class max_arraylist {
    
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(44);
        list.add(9);
        list.add(3);
        list.add(15);
        list.add(5);
        System.out.println("order: "+list);
        
       int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            if(max < list.get(i))
            {
                max = list.get(i);
            }
        }
        System.out.println("Max no is : " +max);
    }
}
