
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String s = scan.nextLine();
       String sub = s.substring(0, 2);
       int hr = Integer.parseInt(sub);
       if (s.substring(8,10).equals("PM")) {
           if (hr == 12) {
               System.out.println("12" + s.substring(2,8));
           }
           else {
               hr = hr + 12;
                System.out.println(hr + s.substring(2,8));
           }       
       }
       else {
           if (hr == 12)     
                System.out.println("00" +  s.substring(2,8));
           else
                System.out.println("0" + hr + s.substring(2,8));
       }
        
    }
}
