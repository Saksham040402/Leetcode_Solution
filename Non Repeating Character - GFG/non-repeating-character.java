//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
         char arr[] = S.toCharArray();
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        for(int i = 0; i < arr.length;i++){
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        
        // System.out.println(h);
       // HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(h.get(arr[i]) == 1){
                return arr[i];
            }
            
        }
        
        return '$';
        //Your code here
    }
}

