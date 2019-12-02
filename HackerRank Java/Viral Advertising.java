import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import jdk.nashorn.internal.parser.Scanner;

public class Solution {

    // Completed the viralAdvertising function below.
    static int viralAdvertising(int n) {
        double shared = 5, liked = 0, cumulative = 0, i;
        for (i = 1; i <= n; i++){
                 liked = Math.floor(shared/2);
                cumulative += liked;
                shared = liked * 3;
        }
       
        return (int)cumulative;
    }
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    //input
    int n = sc.nextInt();
    int result = viralAdvertising(n);
    System.out.println(result);
    sc.close();
    }
}