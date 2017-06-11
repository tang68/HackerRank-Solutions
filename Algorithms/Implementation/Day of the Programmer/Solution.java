import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int year){
        String res = "";
        
        if ( year == 1918 ) {
            return "26.09.1918";
        }
        
        if ( year < 1918 ) {
            if (year % 4 == 0)
                return "12.09." + Integer.toString(year);
            else
                return "13.09." + Integer.toString(year) ;
        }
        
        else {
            
            if (year%4 == 0 && year%100 != 0 )
                return "12.09." + Integer.toString(year) ;
             if ((year % 400==0))
                return "12.09." + Integer.toString(year) ;   
                
            else
                return "13.09." + Integer.toString(year) ;
                
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
