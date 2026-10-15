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