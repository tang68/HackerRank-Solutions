import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       	Scanner scan = new Scanner(System.in);
    	
    	int[][]  a = new int[6][6];
    	
    	for (int i = 0; i < 6; i++){
    		for (int j = 0; j < 6; j++){
    			a[i][j] = scan.nextInt();
    		}
    	}
    	int x = 0;
    	int y = 0;
    	int count = 0;
    	int sum = 0;
    	int larger = -1000;
    	
    	while (x <= 3) {
    		
	    	while ( y <= 3 && count <= 4) {
	    		sum = 0;
	    		for ( int i = x; i < x + 3; i++) {
	    			for (int j = y; j < y + 3; j++) {
	    				sum += a[i][j];	
	    			}
	    		}	
	    		sum -= a[x+1][y];
	    		sum -= a[x+1][y+2];
	    //		larger = sum;
	    		if (sum > larger)
	    			larger = sum;
	    		y++;
	    	}
	    	
	    	count++;
	    	y = 0;
	    	x++;
    	}
    	
    	System.out.println(larger);
    }
}
