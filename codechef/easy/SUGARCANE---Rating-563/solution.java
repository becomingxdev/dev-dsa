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