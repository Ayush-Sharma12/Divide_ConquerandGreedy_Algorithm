package Divide_Conquer.Assignment;

public class Q2 {
         
          
           public static void main(String[] args) {
                      
                   int[] arr = {7, -3, 2, 8, -4, 11, -6};
                   
                   int fromStart = 0;

                   for(int i=0; i<arr.length; i++)
                   {
                           if(arr[i] < 0)
                           {
                                int temp = arr[i];
                                arr[i] = arr[fromStart];
                                arr[fromStart] = temp;
                                fromStart++;

                           }
                   } 

                   for(int data : arr)
                   {
                     System.out.print(data +  " ");
                   }
           }
}
