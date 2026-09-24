# SALESEASON - Rating 541

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T03:46:55.840Z  

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
		    
		    int count = 0;
		    
		    for(int j = 0; j < 3; j++) {
		        
		        int x = sc.nextInt();
		        
		        if(x == 0) {
		            count++;
		        } else {
		            count--;
		        }
		        
		    }
		    
		    if(count >= 1) {
		        System.out.println("Water filling time");
		    } else {
		        System.out.println("Not now");
		    }
		    
		}
		
		sc.close();

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SALESEASON)