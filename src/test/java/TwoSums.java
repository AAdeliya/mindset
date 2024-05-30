import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public int[] twoSum(int []nums, int target){
        Map<Integer, Integer> HT = new HashMap<>();
        for ( i = 0; i < nums.length; i++) {
            int compliment = target-nums[i];
            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment), i};

            }
            map.put(nums[i], i);

            
        }
        return null;

    }
    
}
