import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++) {
            
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int credPoints = x * y;
            int bags = (int) credPoints / 100;
            
            System.out.println(bags);
            
        }
        
        sc.close();
        
    }
}
