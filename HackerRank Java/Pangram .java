import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Completed the pangrams function below.
    static String pangrams(String s) {
            int arr[] = new int[26];
            s = s.toLowerCase();
            int i;
            for (i = 0; i < s.length(); i++){
                if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                         int pos = s.charAt(i) - 'a';
                         arr[pos] = 1;
                }
               
            }
            for (i = 0; i < 26; i++){
                if(arr[i] == 0){
                    return "not pangram";
                    
                }
            }
        return "pangram";
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(pangrams(s));
        sc.close();

    }