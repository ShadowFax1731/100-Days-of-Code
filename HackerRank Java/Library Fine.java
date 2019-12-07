import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the libraryFine function below.
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        double fine = 0;
        if (d1 <= d2 && m1 == m2 && y1 == y2)
            fine = 0;
        
        if (y1 == y2){
            if (m1 == m2 && d1 > d2){
                fine = 15 * Math.abs(d2 - d1);
            }
            else if (m1 > m2){
                fine = 500 * Math.abs(m2 - m1);
            }
        }
        else if (y1 > y2)
            fine = 10000;
        return (int)fine;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();
        int result = libraryFine(d1, m1, y1, d2, m2, y2);
        System.out.println(result);
        sc.close();
    }
}
