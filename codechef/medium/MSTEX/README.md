# MSTEX

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Most Expensive Items

Chef is given the prices of $N$ items and wants to buy exactly $K$ of them.

Find the  **maximum possible total price**  of the $K$ items he can choose.

### Input Format

The first line contains an integer $T$ — the number of test cases.

For each test case:

- The first line contains two space-separated integers $N$ and $K$ — the number of items and the number of items Chef wants to buy.
- The second line contains $N$ space-separated integers $C_1,C_2,\ldots,C_N$ — the prices of the items.
### Output Format

For each test case, print a single integer — the total cost of the $K$ most expensive items.

### Constraints
- $1 \le T \le 100$
- $1 \le K \le N \le 100$
- $1 \le C_i \le 100$
### Sample 1:
Input
Output

```
3
5 2
4 9 1 7 6
4 3
10 3 8 5
6 1
2 11 4 9 7 5
```

```
16
23
11
```

### Explanation:

For the first test case, the two highest prices are $9$ and $7$.

$9+7=16$

For the second test case, the three highest prices are $10$, $8$, and $5$.

$10+8+5=23$

For the third test case, Chef buys only the most expensive item, which costs $11$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-12T14:03:45.955Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int t = sc.nextInt();
	    
	    for(int i = 0; i < t; i++) {
	        
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        
	        int arr[] = new int[n];
	        
	        for(int j = 0; j < n; i++)  {
	            arr[j] = sc.nextInt();
	        }
	        
	        Arrays.sort(arr);
	        int sum = 0;
	        for(int x = n - 1; x >= (n - k); x--) {
	            sum += arr[x];
	        }
	        
	        System.out.println(sum);
	        
	    }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MSTEX)