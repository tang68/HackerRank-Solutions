import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        long max = 0;
        long min = Long.MAX_VALUE;
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        
        for (int i =0; i < 5; i++) {
            long tmp = sum;
            tmp -= arr[i];
            if (tmp < min)
                min = tmp;
            if (tmp > max)
                max =tmp;
        }
        
        System.out.println(min + " " + max);
    }
}
