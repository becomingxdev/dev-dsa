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
		    
		    double x = sc.nextDouble();
		    double y = sc.nextDouble();
		    
		    double percent = y / x;
		    
		    if (percent >= 0.5) {
		        System.out.println("YES");
		    } else {
		        System.out.println("NO");
		    }
		}
		
		sc.close();
	}
}
