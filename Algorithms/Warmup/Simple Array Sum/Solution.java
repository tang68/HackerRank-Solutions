import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
          arr[i] = scan.nextInt();
        }
        
        for (int i =0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print(sum);
    }
}
