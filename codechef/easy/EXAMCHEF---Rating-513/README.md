# EXAMCHEF - Rating 513

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T02:53:38.265Z  

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

```

---

[View on CodeChef](https://www.codechef.com/problems/EXAMCHEF)