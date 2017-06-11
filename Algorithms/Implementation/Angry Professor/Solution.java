import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        
        for (int i = 0; i < testCases; i++) {
             int lateStudents = 0;
             int students = scan.nextInt();
             int thre = scan.nextInt();
             for ( int j = 0; j < students; j++) {
                 int each = scan.nextInt();
                 if (each > 0)
                     lateStudents++;
             }
            
          //  System.out.println("Late students: " + lateStudents);
            if ((students - lateStudents) < thre)
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
       
        
    }
}
