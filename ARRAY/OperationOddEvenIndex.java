//multiply odd indexed elements by 2 and add 10 to even indexed elements
import java.util.Scanner;
public class OperationOddEvenIndex {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit of array");
        
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the element in array");
        for (int i = 0; i < n; i++)
             {
            arr[i]=sc.nextInt();
        }
         for (int i = 0; i < n; i++)
             {
            System.out.println("array is "+arr[i]);
        }

        for (int i = 0; i < n; i++)
             {
            if(i%2==0)
            {
                arr[i]=2*arr[i];
            }
            else{
                arr[i]=arr[i]+10;
            }
            System.out.println("updated array is"+arr[i]);
        }
    //     System.out.println("updated array is"+arr[i]);

    
        
    }
}
