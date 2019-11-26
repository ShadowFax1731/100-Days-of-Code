import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Completed the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
        Arrays.sort(height);
        if (k >= height[height.length - 1])
                return 0;
        else
                return height[height.length - 1] - k;


    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n, k;
    n = sc.nextInt();
    k = sc.nextInt();

    int[] height = new int[n];
    for(int i = 0; i < n; i++){
        height[i] = sc.nextInt();
    }
    int result = hurdleRace(k, height);
    System.out.println(result);
    sc.close();
    }
    
}