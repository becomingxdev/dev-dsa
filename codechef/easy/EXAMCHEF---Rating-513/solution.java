import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
		    
		    int time = sc.nextInt();
		    
		    if((time + 3) > 10) {
		        System.out.println("No");
		    } else {
		        System.out.println("Yes");
		    }
		    
		}
		
		sc.close();

	}
}
