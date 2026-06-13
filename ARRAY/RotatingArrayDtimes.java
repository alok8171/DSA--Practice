//rotating array by d times
import java.util.*;

public class RotatingArrayDtimes {
    public static void main(String[] args) {
        int[] arr={6,8,1,2,4,9,0};
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }

        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int n=arr.length;
        d=d%n;
        Reverse(arr,0,d-1);
        Reverse(arr, d, arr.length-1);
        Reverse(arr, 0, arr.length-1);
        for(int ele:arr)
        {
            System.out.print(ele);
        }


        
    }

   static void Reverse(int[] arr,int i,int j )
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
