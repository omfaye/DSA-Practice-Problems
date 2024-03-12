import java.util.*;
public class create
{


    public static void main(String[] args) 
    {   
        //create T.C - O(1)
        HashMap<String,Integer> hm = new HashMap<>();
        //Insert T.C - O(1) 
        hm.put("India",100);
        hm.put("china",150);
        hm.put("bhutan",2);
        hm.put("pak",20);

        // System.out.println(hm);

        // //get T.C - O(1)
        // System.out.println(hm.get("India"));

        // //contains Key T.C - O(1)
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Indo"));

        //remove T.C - O(1)
        //size T.C - O(1)
        //isEmpty T.C - O(1)
        //clear (pura hashmap khali ho jayega)/

        //iterate
        Set<String> keys = hm.keySet();
        for (String k : keys) 
        {
            System.out.println("Key = "+k+ ", Value = " + hm.get(k));    
        }
    }
}