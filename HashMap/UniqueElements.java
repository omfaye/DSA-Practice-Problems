import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class UniqueElements {
    class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int nums[] = new int[map.size()];
        Set<Integer> s = map.keySet();
        int i=0;
        for(Integer m: s){
            nums[i] = map.get(m);
            i++;
        }
        Arrays.sort(nums);
        int uniqueCount = nums.length;
        for (int j = 0; j < nums.length; j++) {
            if (k >= nums[j]) {
                k -= nums[j];
                uniqueCount--;
            } else {
                break;
            }
        }
        return uniqueCount;
    }
}    
}
