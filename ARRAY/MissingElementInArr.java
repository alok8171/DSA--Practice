/*You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive).
 This array represents a permutation of the integers from 1 to n with one element missing. 
 Your task is to identify and return the missing element.

Examples:

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.
Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.*/
import java.util.*;
public class MissingElementInArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit ");
        int l=sc.nextInt();
        int[] arr=new int[l];
        for (int i = 0; i < l; i++)
          {
            arr[i]=sc.nextInt();
          }
        
         for(int ele:arr)
        {
            System.out.print(ele);
        }

        int n=arr.length+1;
        int Sum=n*(n+1)/2;
        int arrSum=0;
        for(int ele :arr)
        {
            arrSum=arrSum+ele;
        }
        int c=Sum-arrSum;
        System.out.println("missed element is "+c);
    }
}
