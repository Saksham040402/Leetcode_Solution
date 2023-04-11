class Solution {
    public int arrangeCoins(int n) {
        int s = 0;
        int a = 2;
        if(n>0)
            s+=1;
        n = n-1;
        
        while(n > 0)
        {
            n = n-a;
            if(n>=0)
                s+=1;
            
            a++;
        }
        return s;
    }
}