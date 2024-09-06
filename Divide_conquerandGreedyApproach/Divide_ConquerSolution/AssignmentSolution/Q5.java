package Divide_Conquer.Assignment;

import java.util.*;


public class Q5 {
         

          public static String checkingOverLap(int[][] intervals)
          {
 
                Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
                    
                    LinkedList<int[]> ll = new LinkedList<>();

                    for(int[] interval : intervals)
                    {
                            if(ll.isEmpty() || ll.getLast()[1] <= interval[0])
                            {
                               ll.add(interval);
                            }   
                            else{
                               return "Yes";
                            }

                    }    
                    
                    return "No";
          }
          
          public static void main(String[] args) {
                    
                    int[][] interval = {{1,3}, {7,9}, {4,6}, {10,13}};
             
                    String res = checkingOverLap(interval);
        
                     System.out.println(res);
                 

          }
}
