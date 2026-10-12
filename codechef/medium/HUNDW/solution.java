import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
		    
		    int m = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    int arr[] = new int[m];
		    int limit = x * y;
		    
		    for(int j = 0; j < m; j++) {
		        arr[j] = sc.nextInt();
		    }
		    
		    Arrays.sort(arr);
		    
		    int unsafe = 0;
		    int pointer = 0;
		    
		    for(int j = 0; j < m; j++) {
		        
		        int left = Math.max(1, arr[j] - limit);
		        int right = Math.min(100, arr[j] + limit);
		        
		        int start = Math.max(left, pointer + 1);
		        
		        if (right >= start) {
		            unsafe += right - start + 1;
		        }
		        
		        if(right > pointer) {
		            pointer = right;
		        }
		        
		    }
		    
		    System.out.println(100 - unsafe);
		}
		
		sc.close();
	}
}
