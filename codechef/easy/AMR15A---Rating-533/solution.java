import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int count = 0;
        
        for(int i = 0; i < n; i++) {
            
            int weapon = sc.nextInt();
            
            if((weapon % 2) == 0 ) {
                count++;
            } else {
                count--;
            }
            
        }
        
        if(count > 0) {
            System.out.println("READY FOR BATTLE");
        } else {
            System.out.println("NOT READY");
        }
        
        sc.close();
    }
}
