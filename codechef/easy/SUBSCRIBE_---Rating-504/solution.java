import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		for(int i = 0; i < len; i++) {
		    
		    int n = sc.nextInt();
		    int sub = sc.nextInt();
		    int totalGrp = 1;
		    
		    if(n % 6 == 0) {
		        totalGrp = n / 6;
		    } else {
		        totalGrp = (n / 6) + 1;
		    }
		    
		    int cost = totalGrp * sub;
		    
		    System.out.println(cost);
		    
		}
	}
}
