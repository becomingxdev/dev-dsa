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
		    
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    
		    int totalSlices = n * x;
		    int totalPizza;
		    
		    if((totalSlices % 4) != 0) {
		        totalPizza = ((int) totalSlices / 4) + 1;
		    } else {
		        totalPizza = totalSlices / 4;
		    }
		    
		    System.out.println(totalPizza);
		}
		
		sc.close();
	}
}
