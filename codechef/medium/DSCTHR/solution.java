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
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < 3; j++) {
                int temp = sc.nextInt();
                max = Math.max(max, temp);
            }
            System.out.println(max);
        }
        sc.close();
    }
}