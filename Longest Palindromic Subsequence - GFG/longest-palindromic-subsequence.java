//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here
        int n=S.length();
        int[][] dp=new int[n+1][n+1];
        String rev=new StringBuilder(S).reverse().toString();
        for(int i=n;i>=0;i--)
        {
            for(int j=n;j>=0;j--)
            {
                if(i==n || j==n) dp[i][j]=0;
                else if(S.charAt(i)==rev.charAt(j)) dp[i][j]=1+dp[i+1][j+1];
                else dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
            }
        }
        
        
        return dp[0][0];
    }
}