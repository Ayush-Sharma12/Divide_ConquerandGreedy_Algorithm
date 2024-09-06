package Divide_Conquer.Assignment;


import java.util.*;
public class Q4 {
           

          public static boolean checkingPerm(int[] a, int[] b, int k)
          {
  
                  Arrays.sort(a); // sorting in ascending order.
                  Arrays.sort(b); // sorting in ascending order

                  // for sorting in descending order of an simple array(1D) 
                   // Arrays.sort(b, Collections.reverseOrder());
                  // int count = 0;
                  for(int i=0, j = b.length-1; i<a.length && j>=0; i++, j--)
                  {
                             if(a[i] + b[j] < k) // if the Sum of both the array is greator than or equal to k then we increment count by 1
                                   return false;
                  }
                      
                  return true;

               

          }

           public static void main(String[] args) {
                    
              int[] a = {2, 1, 3};
              int[] b = {7, 8, 9};
               
               int k = 10;
               boolean isValid = checkingPerm(a, b, k);
          
                    if(isValid)
                          System.out.println("Yes");

                    else
                    System.out.println("No");
                        
                      
           }
}
