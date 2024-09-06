package Divide_Conquer.Assignment;


public class Q1 {
          

       public static void main(String[] args) {
          
           // given an array as an input arr[] = [3, 8, 6, 7, 5, 9, 10]
           // here the element are almost  sorted in increasing order except two swapped. 
           
           int[] arr = {3, 8, 6, 7, 5, 9, 10};
            for(int value : arr)
           {
                System.out.print(value + " ");
           }
       
   
         // finding the swaped element in sorted array

             
                 int x = -1; // storing first element
                 int y  = -1; // storing second element
                  int prev = 0;
                 for(int i= prev+1; i<arr.length; i++,prev++)
                 {
                         if(arr[prev] > arr[i])
                         {
                                if(x == -1) // checking for first element
                                {
                                    x = prev;
                                    y = i; // assuming if the swaped element is adjacent
                                }
                                 else  // if first element fetched then we fetch the second element
                                 { 
                                   y = i; 
                                   break;
                                 }   
                         }
                 }

                 // swap the x element with y element.
                   
                  int temp = arr[x];
                  arr[x] = arr[y];
                  arr[y] = temp;

                  for(int data : arr)
                  {
                     System.out.print(data + " ");
                  }
       }


}
