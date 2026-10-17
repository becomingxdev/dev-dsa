# Count Paths from Top Left to Bottom Right

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two integers  **m**  and  **n**  representing the number of rows and columns of a grid, respectively, find the number of distinct paths from the top-left cell (0, 0) to the bottom-right cell (m - 1, n - 1). From any cell, you can move only right or down.

 **Note:**  The answer is guaranteed to fit within a 32-bit integer.

 **Examples:** 

```
Input: m = 2, n = 3
Output: 3
Explanation: There are three distinct paths from the top-left cell to the bottom-right cell.
 
```

```
Input: m = 1, n = 4
Output: 1
Explanation: There is only one possible path from the top-left cell to the bottom-right cell.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T04:59:01.579Z  

```java
import java.util.*;

class Solution {
    public int numberOfPaths(int m, int n) {
        // code here
        
        int[][] dp = new int[m][n];
        
        for(int i = 0; i < m; i++) {
            Arrays.fill(dp[i], 1);
        }
        
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                
            }
        }
        
        return dp[m - 1][n - 1];
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/number-of-paths0926/1)