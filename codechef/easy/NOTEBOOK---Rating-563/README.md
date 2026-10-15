# NOTEBOOK - Rating 563

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T03:42:24.943Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int glasses = sc.nextInt();
            int revenue = glasses * 50;
            int profit = (int) (revenue * 0.3);

            System.out.println(profit);
        }

        sc.close();

    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NOTEBOOK)