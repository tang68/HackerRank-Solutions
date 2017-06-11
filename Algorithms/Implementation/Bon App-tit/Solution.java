import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int items = scan.nextInt();
        int voidItems = scan.nextInt();
        int[] prices = new int[items];
        int bill  = 0;
        int priceVoid = 0;
        for (int i = 0; i < items; i++) {
            prices[i] = scan.nextInt();
            bill += prices[i];
            if (i == voidItems) 
               priceVoid = prices[i];
        }
        int charge = scan.nextInt();
        
        int ans = bill/2 - priceVoid/2;
        
        if (charge == ans) 
            System.out.println("Bon Appetit");
        
        else
            System.out.println(priceVoid/2);
    }
}



