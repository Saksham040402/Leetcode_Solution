//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
    int findK(int a[][], int m, int n, int num)
    {
	// Your code here
	// Your code here
	   // A[][] = new int[n][m];
	   // int a = 1;
	   // for(int i = 0; i < n; i++){
	   //     for(int j = 0; j < m;j++){
	   //         a[i][j] = a;
	   //         a++;
	   //     }
	   // }
	    int i, k = 0, l = 0;
 
       
        int count=1;
        while (k < m && l < n) {
            for (i = l; i < n; ++i) {
                if(count==num){
                    return a[k][i];
                    // break;
                }
                count++;
            }
            k++;
 
            
            for (i = k; i < m; ++i) {
                if(count==num){
                    return a[i][n-1];
                    // break;
                }
                count++;
            }
            n--;
 
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    if(count==num){
                    return a[m-1][i];
                    // break;
                }
                count++;
                }
                m--;
            }
 
            
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    if(count==num){
                    return a[i][l];
                }
                count++;
                }
                l++;
            }
        }
        return -1;
    }
}