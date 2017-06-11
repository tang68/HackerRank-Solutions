import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        int count = 0;
        Map<Integer, Boolean> m = new HashMap<>();
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
            if (!m.containsKey(c[c_i])) {
                m.put(c[c_i], true);
            }
            else if (m.containsKey(c[c_i])){
                count++;
                m.remove(c[c_i]);
            }
            
            
        }
        System.out.println(count);
    }
}
