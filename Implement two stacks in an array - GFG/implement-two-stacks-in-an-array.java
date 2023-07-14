//{ Driver Code Starts
import java.util.*;

class TwoStack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		int T = sc.nextInt();
		while(T>0)
		{
			twoStacks g = new twoStacks();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int stack_no = sc.nextInt();
				int QueryType = sc.nextInt();
				
				
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					if(stack_no == 1)
					 g.push1(a);
					else if(stack_no ==2)
					 g.push2(a);
				}else if(QueryType == 2)
				{
					if(stack_no==1)
					System.out.print(g.pop1()+" ");
					else if(stack_no==2)
					System.out.print(g.pop2()+" ");
				}
			
				Q--;
			}
				System.out.println();
		  T--;
		}
	}
}


// } Driver Code Ends



class twoStacks
{
    int size,top1,top2;
    int[] arr;
    
    twoStacks()
    {
        this.size=100;
        this.arr=new int[size];
        this.top1=-1;
        this.top2=size;
    }
    
    
    void push1(int x)
    {
        if(top1>=top2) return;
        
        arr[++top1]=x;
    }
    void push2(int x)
    {
       if(top1>=top2) return;
       arr[--top2]=x;
    }
    int pop1()
    {
        if(top1==-1) return -1;
        return arr[top1--];
    }
  
    int pop2()
    {
        if(top2==size) return -1;
        return arr[top2++];
    }
}

