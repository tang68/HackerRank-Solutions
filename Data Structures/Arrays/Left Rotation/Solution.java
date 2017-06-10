import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int size = scan.nextInt();
        int shifts = scan.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = scan.nextInt();
        }
        
        int[] parts = new int[shifts];
        for (int i = 0; i < shifts; i++)
            parts[i] = a[i];
        
        
        int j = shifts;
        for (int i = 0; i < size - shifts; i++) {
            a[i] = a[j]; 
            j++;
        }
        
        
        int k = 0;
        for ( int i = size - shifts; i < size; i++) {
            a[i] = parts[k];
            k++;
        }
    
         for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
       
    }

}
