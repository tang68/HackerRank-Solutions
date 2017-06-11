import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        int[] a = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();           
            a[types[types_i]]++;
        }
        
       int max = a[0];
        int returnVal = 0;
        for ( int i = 1; i < n; i++) {
            
          // System.out.print(a[i] + " ");
            if (a[i] > max) {
                max = a[i];
                returnVal = i;
            }
                
        }
        System.out.println( returnVal);
    }
}
