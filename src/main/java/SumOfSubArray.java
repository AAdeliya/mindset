import java.util.HashMap;

public class SumOfSubArray {
    

    public int SubArraySum(int[] nums, int k){
        int sum = 0; //keep a running total of the number from start to the current index j
        int ans=0; //store the total count of subarray that sum up to k

        HashMap<Integer, Integer> map = new HashMap<>();
         map.put(0,1);
        for (int j = 0; j < nums.length; j++) { //iterates over each element of the array nums
            sum+= nums[j];// updates the running total sum by adding the current element nums[j] to it
            if(map.containsKey(sum-k)){// The key idea is that if sum - k exists in the map, it means there is a previous cumulative sum that,
                // when subtracted from the current cumulative sum (sum),
                // results in k. This implies that there is a subarray ending at index j that sums up to k.



                ans+= map.get(sum-k);


                //
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
            
        }

     return ans; 

    }
    
}
