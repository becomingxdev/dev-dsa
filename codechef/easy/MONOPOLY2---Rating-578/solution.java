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
		
		for (int i = 0; i < t; i++) {
		    
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    
		    int sum = a + b + c + d;
		    
		    if((a > (sum - a)) || (b > (sum - b)) || (c > (sum - c)) || (d > (sum - d))) {
		        System.out.println("Yes");
		    } else {
		        System.out.println("No");
		    }
		}
		
		sc.close();

	}
}
