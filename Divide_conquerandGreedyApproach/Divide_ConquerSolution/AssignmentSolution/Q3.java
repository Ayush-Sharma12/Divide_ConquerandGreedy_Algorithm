package Divide_Conquer.Assignment;

import java.util.Arrays;

public class Q3 {
           
          public static void segregate(int[] nums, int[] temp, int l, int h)
          {
                     if(l>=h)
                       return;
                       
                    int mid = l + (h-l)/2;

                    segregate(nums, temp, l, mid);
                    segregate(nums, temp, mid+1, h);

                    merge(nums, temp, mid, l,  h);

          }

          public static void merge(int[] nums, int[] temp, int mid, int l, int h)
          {
                     
                   int k = l;
                    
                   // copying the negative element from the leftSubArray 
                    for(int i=l; i<=mid; i++)
                    {
                            if(nums[i] < 0)
                               temp[k++] = nums[i];   
                    }
                   
                    for(int i=mid+1; i<=h; i++)
                    {
                              if(nums[i] < 0)
                                  temp[k++] = nums[i]; 
                    } 

                    for(int i=l; i<=mid; i++)
                    {
                            if(nums[i] >= 0)
                               temp[k++] = nums[i];   
                    }
                   
                    for(int i=mid+1; i<=h; i++)
                    {
                              if(nums[i] >= 0)
                                  temp[k++] = nums[i]; 
                    } 

                    for(int i=l; i<=h; i++)
                    {
                               nums[i] = temp[i]; 
                    }

          
          }

        public static void main(String[] args) {
              
             int[] arr = {3, -2, 5 ,-8, -11, 32};
             int[] temp = new int[arr.length];

              for(int i=0; i<arr.length; i++)
              {
                      temp[i] = arr[i];
              }

          segregate(arr, temp, 0, arr.length-1);
          System.out.println(Arrays.toString(arr));
                    

            
        }  
            
}
