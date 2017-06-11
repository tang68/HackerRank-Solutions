import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        int[] res = new int[2];
        int most = 0;
        int least = 0;
        
        int min = s[0];
        int max = s[0];
        
        for (int i = 1; i < s.length; i++) {
            if (s[i] > max) {
                most++;
                max = s[i];
            }
                
            if (s[i] < min) {
                least++;
                min = s[i];
            }
                
        }    
        res[0] = most;
        res[1] = least;
        
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
