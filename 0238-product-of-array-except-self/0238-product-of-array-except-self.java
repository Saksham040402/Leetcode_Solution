class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ar[] = new int[nums.length];
        int ar1[] = new int[nums.length];
        int ar2[] = new int[nums.length];
        // int s = 0;
        ar[0] = 1;
        ar1[nums.length-1] = 1;
        for(int i = 1; i < nums.length; i++)
        {
            ar[i] = nums[i-1]*ar[i-1];
        }

        for(int j = nums.length-2; j >= 0;j--)
        {
            ar1[j] = nums[j+1]*ar1[j+1];
        }
//         for(int i = 0;i < nums.length;i++)
//         {
//             System.out.println(ar[i]);
//             System.out.println(ar1[i]);

//         }
        // ar[0] =0;
        // ar1[nums.length-1] = 0;
        for(int i = 0; i < nums.length; i++)
        {
            ar2[i] = ar[i] * ar1[i];
        }
        return ar2;
    }
}