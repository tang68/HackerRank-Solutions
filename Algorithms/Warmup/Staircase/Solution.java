import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        String[][] a = new String[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = n - i -1; j < n; j++) {
                a[i][j] = "#";
            }
            
        }
        
        for (int i =0; i< n; i++) {
            for (int j = 0; j <n; j++) {
                if (a[i][j] == null) {
                    System.out.print(" ");
                }
                else {
                    System.out.print(a[i][j]);
                }
                
            }
            System.out.println();
        }
    }
}
