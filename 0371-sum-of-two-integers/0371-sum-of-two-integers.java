class Solution {
    public int getSum(int a, int b) {
        int x = a&b;
        x = x<<1;
        int c = a^b;
        if(x==0)
            return c;
        return getSum(x,c);
    }
}