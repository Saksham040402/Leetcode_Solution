//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0)
        {
            int sizeOfStack =sc.nextInt();
            Stack <Integer> myStack=new Stack<>();
            
            //adding elements to the stack
            for(int i=0;i<sizeOfStack;i++)
            {
                int x=sc.nextInt();
                myStack.push(x);
                
            }
                Solution obj=new Solution();
                obj.deleteMid(myStack,sizeOfStack);
                
                while(!myStack.isEmpty())
                {
                    System.out.print(myStack.peek()+" ");
                    myStack.pop();
                }
                System.out.println();
        }
        
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to delete middle element of a stack.
    private void solve(Stack<Integer> s, int sizeOfStack, int midInd) {
        if (sizeOfStack == 0) {
            return;
        }
        
        int el = s.pop();
        solve(s, sizeOfStack - 1, midInd);
        
        if (midInd != sizeOfStack) {
            s.add(el);
        }
    }
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        solve(s,sizeOfStack,(sizeOfStack+1)/2);
    } 
}
