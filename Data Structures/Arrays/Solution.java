import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner scan = new Scanner(System.in);

        int numOfEntries = scan.nextInt();
        int[] arr = new int[numOfEntries];
      
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        
        for(int i = arr.length  - 1; i >= 0; i--) {
             System.out.print(arr[i] + " ");
        }
    }
}
