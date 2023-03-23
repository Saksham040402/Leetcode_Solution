import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l = new ArrayList<Boolean>();
        int arr[] = new int[candies.length];
        for(int i = 0; i< candies.length; i++)
        {
            arr[i] = candies[i];
        }
        Arrays.sort(candies);
        int a = candies[(candies.length-1)]-extraCandies;
        
        
        for(int i = 0; i < arr.length;i++)
        {
            if(arr[i]>=a)
            {
                l.add(true);
            }
            else
            {
                l.add(false);
            }
        }
        return l;
    }
}