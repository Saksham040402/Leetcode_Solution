class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            if((i == 0) && (nums[i] != nums[i+1])) {
                return nums[i];
            }
            if(i == 0){
                continue;
            }
            if((nums[i] != nums[i-1]) && (nums[i] != nums[i+1])){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}