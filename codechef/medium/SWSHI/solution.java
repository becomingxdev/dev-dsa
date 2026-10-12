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
            int m = sc.nextInt();

            int sweetCost[] = new int[n];

            for (int j = 0; j < n; j++) {
                sweetCost[j] = sc.nextInt();
            }

            int noOfSweets = 0;
            int left = 0;
            int right = 0;
            int currCost = 0;

            for (right = 0; right < n; right++) {

                currCost += sweetCost[right];

                while (currCost > m) {
                    currCost -= sweetCost[left];
                    left++;
                }

                noOfSweets = Math.max(noOfSweets, right - left + 1);

            }

            System.out.println(noOfSweets);
        }

        sc.close();

    }
}