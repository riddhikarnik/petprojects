import java.io.*;
import java.util.*;

class Solution {
  
  public static void main(String[] args) {
   // System.out.println("So the max is " + 
   // maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5,4}));
    
    System.out.println("So the max is " + 
    maxSubArray(new int[] {14,3,5,6,-7,-4,-6,7,-11,12}));
  }
  
    public static int maxSubArray(int[] A) {
      int max = A[0];
      int[] sum = new int[A.length];
      sum[0] = A[0];
      System.out.println("Initial Max is " + max);
      
      for (int i = 1; i < A.length; i++) {
        System.out.println("Max of "+ A[i] +" and "+(sum[i - 1] + A[i])+" for temp sum");
      
        sum[i] = Math.max(A[i], sum[i - 1] + A[i]);
        
      System.out.print("Max of "+ max +" and "+ sum[i] +" for final sum..........");
        max = Math.max(max, sum[i]);
        System.out.println("Max is " + max);

        System.out.println("############");
      }

      return max;
    }
}
