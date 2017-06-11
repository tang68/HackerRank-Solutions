import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        
        int tallest = height[0];
        int count = 1;
        for (int i = 1; i < height.length; i++) {
            if (height[i] > tallest) {
                tallest = height[i];
                count = 0;
            }
            if ( height[i] == tallest) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
