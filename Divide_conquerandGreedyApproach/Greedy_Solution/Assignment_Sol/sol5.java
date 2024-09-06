package Greedy.Assignment;

import java.util.Arrays;
import java.util.LinkedList;

public class sol5 {
        public static int eraseOverlapIntervals(int[][] intervals) {
         
          
           
           LinkedList<int[]> list = new LinkedList<>();
           Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

           int totalRemove = 0;

           for(int[] interval : intervals) {

                  if(list.isEmpty() || list.getLast()[1] <= interval[0]) {
                       list.add(interval);
                  }else{
                     totalRemove++;
                     list.getLast()[1] = Math.min(list.getLast()[1], interval[1]); 
                  }
           }

           return totalRemove;
            
    }

           public static void main(String[] args) {
                    int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};

                    System.out.println(eraseOverlapIntervals(intervals));
                            
           }
}
