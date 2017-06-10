import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int NumOfsequences = scan.nextInt();
        ArrayList<Integer>[] seqList = new ArrayList[NumOfsequences];
        int lastAnswer = 0;
        
        for ( int i = 0; i < NumOfsequences; i++) {
            seqList[i] = new ArrayList<>();
            
        }
        
        int NumOfQ = scan.nextInt();
        for (int i = 0; i < NumOfQ; i++) {
            int type = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            int seqIndex = ((x^lastAnswer) % NumOfsequences);
            
            if (type == 1) {
                seqList[seqIndex].add(y);
            }
            else if (type == 2) {
                int sizeOfSeqIndex = seqList[seqIndex].size();
                int toLastans = seqList[seqIndex].get(y%sizeOfSeqIndex);
                
                lastAnswer = toLastans;
                System.out.println(lastAnswer);
            }
           
        }

    }
}
