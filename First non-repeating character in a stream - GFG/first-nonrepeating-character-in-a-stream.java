//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        int n = A.length();
        int[] fast = new int[26];
        int[] first = new int[26];
        Arrays.fill(first, -1);

       
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            
            if (first[A.charAt(i) - 'a'] == -1) {
                first[A.charAt(i) - 'a'] = i;
            }
            
            fast[A.charAt(i) - 'a'] += 1;
            char ch = '#';
            int x = n + 1;
            for (int j = 0; j < 26; j++) {
                if (fast[j] == 1 && x > first[j]) {
                    ch = (char) (j + 'a');
                    x = first[j];
                }
            }
            
            ans.append(ch);
        }

        return ans.toString();
    }
}