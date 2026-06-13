//negative element in array
import java.util.*;

public class NegativeElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no. of element: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("enter the no. of element: ");
        for (int i = 0; i < n; i++) 
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            if(arr[i]<0)
            {
                System.out.println(arr[i]+" ");
            }
        }

    }
}
