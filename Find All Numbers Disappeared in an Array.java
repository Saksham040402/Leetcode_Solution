class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ar = new ArrayList(4);
        int p = nums.length;
        for(int i = 0;i < p;i++)
        {
            int n = Math.abs(nums[i]);
            if(nums[n-1] > 0)
            {
                nums[n-1] = -1*nums[n-1];
            }
        }
        for(int i = 0;i < p;i++)
        {
            if(nums[i] > 0)
            {
                ar.add(i+1);
            }
        }
        return ar;
    }
}
