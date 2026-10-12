import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int t = sc.nextInt();
	    
	    for(int i = 0; i < t; i++) {
	        
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        
	        int arr[] = new int[n];
	        
	        for(int j = 0; j < n; j++)  {
	            arr[j] = sc.nextInt();
	        }
	        
	        Arrays.sort(arr);
	        int sum = 0;
	        for(int x = n - 1; x >= (n - k); x--) {
	            sum += arr[x];
	        }
	        
	        System.out.println(sum);
	        
	    }
	}
}
