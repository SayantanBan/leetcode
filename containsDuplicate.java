class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        boolean result = false;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                result = true;
                return result;
            }else{
                set.add(nums[i]);
            }
        }
        return result;
    }
}
