import java.util.HashMap;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mapN = new HashMap<>();
        for(int i=0; i< nums.length;i++){
            mapN.put(nums[i],mapN.getOrDefault(nums[i],0)+1);
            if(mapN.get(nums[i])>(nums.length/2)){
                return nums[i];
            }
        }
        return -1;
    }
}
