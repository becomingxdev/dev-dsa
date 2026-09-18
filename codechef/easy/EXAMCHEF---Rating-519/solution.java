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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    double totalStudentsWhoShouldHavePassed = 0.5 * x * y;
		    
		    int z = sc.nextInt();
		    
		    if(z > totalStudentsWhoShouldHavePassed) {
		        System.out.println("Yes");
		    } else {
		        System.out.println("No");
		    }
		    
		}
		sc.close();
	}
}
