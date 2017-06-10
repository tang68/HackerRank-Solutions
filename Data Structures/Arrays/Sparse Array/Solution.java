import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<String> a = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            String s = scan.next();
            a.add(s);
        }
      
        
        int Q = scan.nextInt();

        for (int i = 0; i < Q; i++) {
            String s = scan.next();
            int count = Collections.frequency(a, s);
            System.out.println(count);
            
        }
        
    }
}
