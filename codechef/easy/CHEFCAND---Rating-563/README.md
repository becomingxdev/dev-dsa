# CHEFCAND - Rating 563

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T03:46:27.692Z  

```java
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
		    int noOfNotebooks = (n * 1000) / 100;
		    
		    System.out.println(noOfNotebooks);
		}
		
		sc.close();

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CHEFCAND)