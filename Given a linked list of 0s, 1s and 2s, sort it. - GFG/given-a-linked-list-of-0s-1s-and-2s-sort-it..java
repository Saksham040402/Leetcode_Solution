//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n =Integer.parseInt(in.readLine().trim());
            String s[] = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(s[i]));
                tail = tail.next;
            }

            head = new Solution().segregate(head);
            printList(head, out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node head,PrintWriter out)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}




// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        // Node current = head, index = null;  
        // int temp = 0;  
        // if(head == null) {  
        //     return;  
        // }  
        // else {  
        //     while(current != null) {  
                
        //         index = current.next;  
                  
        //         while(index != null) {  
        //             if(current.data > index.data) {  
        //                 temp = current.data;  
        //                 current.data = index.data;  
        //                 index.data = temp;  
        //             }  
        //             index = index.next;  
        //         }  
        //         current = current.next;  
        //     }      
        // }
        // return head;
        int arr[]=  new int[3];
        for(Node curr=head; curr!=null; curr=curr.next)
        {
            if(curr.data==0) {
                arr[0]++;
            }
            else if(curr.data==1) {
                arr[1]++;
            }
            else {
                arr[2]++;
            }
        }
        Node curr=head;
        int i=0;
        while(curr!=null)
        {
            if(arr[i]==0)
            i++;
            
            if(arr[i]!=0)
            {
                curr.data = i;
                arr[i]--;
                curr=curr.next;
            }

        }
        return head;
        
    }
    
}


