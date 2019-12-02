import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    //input
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arCount;
        arCount = sc.nextInt();
        long ar [] = long [arCount];
        for (int i = 0; i < arCount; i++){
            ar[] = sc.nextInt();
        }
    
        //result
        long result = aVeryBigSum(ar);
        System.out.println(result);
        sc.close();
	    }
    

    //completed function description for a very big sum
    static long aVeryBigSum(long[] ar) {

        long sum = 0;
        for (int i = 0; i < ar.length; i++){
            sum += ar[i];
        }
         return sum;   
    }
}
