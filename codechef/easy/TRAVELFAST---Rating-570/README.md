# TRAVELFAST - Rating 570

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T03:53:48.253Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            int x = sc.nextInt();

            if (n <= x) {
                System.out.println(0);
            } else {
                int required = n - x;
                int mod = required % 4;

                if (mod == 0) {
                    System.out.println(required / 4);
                } else {
                    System.out.println((required / 4) + 1);
                }
            }

        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/TRAVELFAST)