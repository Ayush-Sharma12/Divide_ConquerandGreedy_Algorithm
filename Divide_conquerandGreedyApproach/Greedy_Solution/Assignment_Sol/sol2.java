package Greedy.Assignment;

import java.util.Arrays;

public class sol2 {

          static class Activity{
          
                    int start;
                    int end;
                    
                    Activity(int start, int end) {
                           
                            this.start = start;
                            this.end = end;
                    }
             }

           public static int activitySelection(int start[], int end[], int n)
           {
        // add your code here
          
       
        Activity[] activity = new Activity[n];
        for(int i=0; i<n; i++) {
              
                activity[i] = new Activity(start[i], end[i]);
         }  
        
        Arrays.sort(activity, (a, b) -> a.end - b.end);
        
        Activity prev = null;
        int maxActivity = 0;
        for(Activity a : activity) {
              
              if(prev == null || prev.end < a.start) {
                     maxActivity++;
                     prev = a;
              }
              
               
               
        }
        
        return maxActivity;
          
          
    }
    
    

     public static void main(String[] args) {
             int[] start = {10, 12, 20};
             int[] end = {20, 25, 30};
             int n = 3;
             
            int res =  activitySelection(start, end, n);
            System.out.println(res);


             
     }
}
