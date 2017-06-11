import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] a = new int[size];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        
        int pos = 0;
        int neg = 0;
        int zero = 0;
        
        for (int i = 0; i < a.length; i++) {
            int x = a[i];
            if (x == 0) {
                 zero += 1;
            }              
            if (x > 0) {
                pos += 1;
            }     
            else if (x < 0)
               neg += 1;
        }
        String patern = "#.######";
        DecimalFormat dec = new DecimalFormat(patern);
        System.out.println(dec.format((double)pos/size));
         System.out.println(dec.format((double)neg/size));
         System.out.println(dec.format((double)zero/size));
    }
}
