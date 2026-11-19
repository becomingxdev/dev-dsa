# Euler Totient Function

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Find the  **Euler Totient Function (ETF)**  Φ(n) for an input **n**.  **ETF**  is the count of numbers in {1, 2, 3, …, n} that are relatively prime to  **n**, i.e., the numbers whose  **GCD**  (Greatest Common Divisor) with  **n**  is 1.

 **Examples:** 

```
Input: n = 11
Output: 10
Explanation: From 1 to 11, 1, 2, 3, 4, 5, 6, 7, 8, 9 and 10 are relatively prime to 11.

```

```
Input: n = 16
Output: 8
Explanation: From 1 to 16, 1, 3, 5, 7, 9, 11, 13 and 15 are relatively prime to 16.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T16:22:14.117Z  

```java
class Solution {
    public int etf(int n) {
        // code here
        int result = n;
        
        for(int p = 2; p * p <= n; p++) {
            
            if(n % p == 0) {
                
                while(n % p == 0) {
                    n /= p;
                }
                
                result -= result / p;
            }
        }
        
        if(n > 1) {
            result -= result / n;
        }
        
        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/euler-totient-function4604/1)