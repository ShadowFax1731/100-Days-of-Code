import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int i, actualBill = 0, total = 0;
        for (i = 0; i < bill.size(); i++){
            total += bill.get(i);
        }
        actualBill = (int)(total - bill.get(k)) / 2;
        if (actualBill == b)
            System.out.println("Bon Appetit");
        else
            System.out.println(b - actualBill);

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> bill = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            int item = sc.nextInt();
            bill.add(item);
        }
        bonAppetit(bill, k, b);
    }
}