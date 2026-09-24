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
		    
		    int count = 0;
		    
		    for(int j = 0; j < 4; j++) {
		        
		        int x = sc.nextInt();
		        if(x == 0) {
		            count++;
		        }
		        
		    }
		    
		    if(count == 4) {
		        System.out.println("IN");
		    } else {
		        System.out.println("OUT");
		    }
		    
		}
		
		sc.close();

	}
}
