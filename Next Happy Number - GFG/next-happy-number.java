//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.nextHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{

    static int nextHappy(int N) {
        int next = N + 1;
        
        while (true) {
            if (IsHappy(next)) {
                return next;
            }
            
            next += 1 ;
        }
    }
    
    private static boolean IsHappy(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        while (!map.containsKey(n)) {
            map.put(n, 1);
            int s = 0;
            
            while (n > 0) {
                int digit = n % 10;
                int w = digit * digit;
                s += w;
                n = n / 10;
            }
            
            if (s == 1) {
                return true;
            }
            
            n = s;
        }
        
        return false;
    }
}