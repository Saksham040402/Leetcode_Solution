class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int ar[] = new int[A.length];
        int a = A.length;
        int n = 1;
        int count = 0;
        while(a>0){
            int count1 = 0;
            for(int i = 0; i < n;i++){
                for(int j = 0; j < n;j++){
                    if(A[i] == B[j])
                    {
                        count1++;   
                    }
                }
            }
            ar[n-1] = count1;
            n++;
            a--;
        }
        return ar;
    }
}