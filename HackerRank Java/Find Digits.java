import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Completed the findDigits function below.
    static int findDigits(int n) {
        int m = n, d, ctr = 0;
        while (n > 0){
            d = n % 10; 
            n = n / 10;
            if (d == 0) 
                continue;
            
            else if (m % d == 0){
                ctr++;
            }
        }
        return ctr;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t, n;
        t = sc.nextInt();
        for (int i = 1; i <= t; i++){
            int n = sc.nextInt();
            int result = findDigits(n);
            System.out.println(result);
        }

        sc.close();
    }
}