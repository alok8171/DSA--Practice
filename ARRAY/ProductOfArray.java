import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no. of element: ");
        int n=sc.nextInt();
        int pro=1;
        int[] arr=new int[n];
        System.out.print("enter the no. of element: ");
        for (int i = 0; i < n; i++) 
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            pro=pro*arr[i];
        }
        System.out.println(pro);
}
}