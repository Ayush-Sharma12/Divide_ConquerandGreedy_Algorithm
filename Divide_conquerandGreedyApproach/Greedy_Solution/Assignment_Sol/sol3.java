package Greedy.Assignment;

public class sol3 {
          public static int canCompleteCircuit(int[] gas, int[] cost) {

                    /* // Brute Force
                     int index = -1;
                     int n = gas.length;
             
                     for (int j = 0; j < n; j++) {
                         int pointer = j;
                         int amount = 0;
                         int destination = 0;
                         if (gas[j] < cost[j]) {
                             continue;
                         }
                         destination = j;
                         amount = gas[j] - cost[j];
                         pointer++;
             
                         while (pointer != destination) {
                          
             
                            if (pointer == n)
                                    pointer = 0;
             
                             if(pointer == destination) break;        
             
                             amount += gas[pointer];
             
                             if (amount < cost[pointer])
                                 break;
             
                             amount -= cost[pointer];
                              pointer++;
             
                              
             
                         }
             
                         
                             if (pointer == destination) {
                                 index = destination;
                                 break;
                             }
             
                     }
             
                     return index; */
             
                     // greedy 
             
                     int n = gas.length;
                      
                      int totalEarning = 0;
                      int totalExpenses = 0;
                     for(int i=0; i<n; i++) {
                            totalEarning += gas[i];
                            totalExpenses += cost[i];
                     }
             
                     if(totalEarning < totalExpenses) return -1;
             
                    int  total = 0; 
                    int result = 0;
                     for(int i=0; i<n; i++) {
                            
                            total += gas[i] - cost[i];
                            if(total < 0) {
                               result = i+1;
                               total  = 0;
                            }
                     }
                    
                     return result;
                 }

                 public static void main(String[] args) {
                        int[] gas = {1, 2, 3, 4, 5};
                        int[] cost = {3, 4, 5, 1, 2};

                        System.out.println(canCompleteCircuit(gas, cost));

                 }
}
