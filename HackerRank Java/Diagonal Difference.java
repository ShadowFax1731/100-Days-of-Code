import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int i, j, d1 = 0, d2 = 0;
        for (i = 0; i < arr.size(); i++){
            for (j = 0; j < arr.size(); j++){
                if (i == j)
                    d1 += arr.get(i).get(j);

                if (i == arr.size() - j - 1)
                    d2 += arr.get(i).get(j);
            }
        }
        return Math.abs(d1 - d2);

    }

}
class Solution{
    public static void main(String [] args){
        Scanner sc - new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> arr = new ArrayList<>();
    
            for (int i = 0; i < n; i++) {
    
                List<Integer> arrRowItems = new ArrayList<>();
    
                for (int j = 0; j < n; j++) {
                    int arrItem = Integer.parseInt(arrRowTempItems[j]);
                    arrRowItems.add(arrItem);
                }
    
                arr.add(arrRowItems);
    
            }
            System.out.println(Result.diagonalDifference(arr));
            sc.close();
        }
}
