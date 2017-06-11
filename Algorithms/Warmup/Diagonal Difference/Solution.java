import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int size = scan.nextInt();
       int[][] a = new int[size][size];
       
       for (int i = 0; i < size; i++) {
           for (int j = 0; j < size; j++) {
               a[i][j] = scan.nextInt();
           }
       }
        
       int sum1 = 0;
       int x = size -1 ;
       for (int i = 0; i < size; i++ ) {
           sum1 += a[i][x];
           x--;
       }
        
       int sum2 = 0;
        int j = 0;
        for (int i = 0; i < size; i++){        
                sum2 += a[i][j];
                j++;     
        }       
        System.out.print(Math.abs(sum1 - sum2));
    }
}
