class Solution {
    // public int[] twoSum(int[] nums, int target) {
    //     for(int i=0; i<nums.length; i++){
    //         for(int j=0; j<nums.length; j++){
    //             if(i!=j){
    //                 if((nums[i] + nums[j]) == target){
    //                     int[] temp = {i,j};
    //                     return temp;
    //                 }
    //             }
    //         }
    //     }
    //     return null;
    // }

    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
