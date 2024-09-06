package Divide_Conquer.Assignment;

public class Q6Inv {
           

          public static int findKthLargest(int[] arr, int k, int l, int h)
          {
                     
                    int m = partition(arr, l, h);
                   
                    if(m == k-1)
                          return arr[m];
                    
                    else if(m > k-1)
                         return  findKthLargest(arr, k, l, m-1);

                    else
                      return findKthLargest(arr, k, m+1, h);                     
          }

          public static int partition(int[] arr, int l, int h)
          {

                    int x = l;
                    int i = l;

                    for(int j=i+1; j<=h; j++)
                    {
                                if(arr[j] >= arr[x])
                                 {
                                          i++;
                                          int temp = arr[j];
                                           arr[j] = arr[i];
                                           arr[i] = temp;
                                        
                                 }  
                              
                    }

                    int temp = arr[i];
                    arr[i] = arr[x]; 
                    arr[x]  = temp;

                    return i;
          }

           public static void main(String[] args) {
                     
                     int[] arr = {3, 1, 1, 6, 90}; 
                     
                      int k = 2;
                   int res = findKthLargest(arr, k, 0, arr.length-1);
                       
                   System.out.println(res);
           }
}
