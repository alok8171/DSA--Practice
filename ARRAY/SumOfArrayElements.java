import java.util.Scanner;

public class SumOfArrayElements {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no. of element: ");
        int n=sc.nextInt();
        int Sum=0;
        int[] arr=new int[n];
        System.out.print("enter the no. of element: ");
        for (int i = 0; i < n; i++) 
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            Sum=Sum+arr[i];
        }
        System.out.println(Sum);

}
}
