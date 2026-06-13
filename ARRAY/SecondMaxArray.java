//second max element in array

public class SecondMaxArray {
    public static void main(String[] args) {
        int[] arr={18,18,47,45,45};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for (int i = 0 ;i < arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("largest element is"+max);
         // calculate second array
         for (int i = 0; i < arr.length; i++) 
            {
             if(arr[i]>smax && arr[i]!=max)
             {
                smax=arr[i];
             }
         }   
         System.out.println("second largest element is"+smax);
        }
    }

