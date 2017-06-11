import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for (int i = 0; i < testCases; i++) {
            int height = 1;
            int cycles = scan.nextInt();
          //  System.out.println("Cycles: " + cycles);
            
            if (cycles == 0)
                System.out.println(1);
            else {
                for (int j = 1; j <= cycles; j++) {
                if (j%2 != 0)
                    height *= 2;
                else 
                    height += 1;
            }
            
            System.out.println(height);
            }
                
            
        }
    }
}
