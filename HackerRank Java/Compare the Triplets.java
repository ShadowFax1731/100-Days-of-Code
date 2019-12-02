import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Completed the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
            int i, alice = 0, bob = 0;
            List<Integer> result = new ArrayList<Integer>();
            for (i = 0; i < a.size(); i++){
                if (a.get(i) > b.get(i))
                    alice++;
                else if (a.get(i) < b.get(i))
                    bob++;
            }
            result.add(alice);
            result.add(bob);
            return result;
    }

public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    List<Integer> a = new ArrayList<Integer>();
    List<Integer> b = new ArrayList<Integer>();
    int i;
    for(i = 0; i < 3; i++){
        int aItem = sc.nextInt();
        int bItem = sc.nextInt();
        a.add(aItem);
        b.add(bItem);
    }

    System.out.println(compareTriplets(a, b));
}