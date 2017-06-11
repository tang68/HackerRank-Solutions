import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b){
        int f = lcm(a);
        int l = gcd(b);
        int count = 0;
        for(int i = f, j =2; i<=l; i=f*j,j++){
            if(l%i==0){ count++;}
        }
        return count;
    }
    
    static int gcd(int a, int b) {
        while (b > 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }       
        return a;
    }
    
    static int gcd(int[] in) {
        int res = in[0];
        for (int i = 1; i < in.length; i++) {
            res = gcd(res, in[i]);
        }
        return res;
    }
    
    static int lcm(int a, int b) {
        return a * (b/gcd(a, b));
    }
    
    static int lcm(int[] in) {
        int res = in[0];
        for (int i = 1; i < in.length; i++) {
            res = lcm(res, in[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}
