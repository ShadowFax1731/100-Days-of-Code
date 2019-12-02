import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigInteger fact = new BigInteger("1");
        int i;
        for (i = 2; i <= n; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);


    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        extraLongFactorials(n);
        sc.close();
    }
}