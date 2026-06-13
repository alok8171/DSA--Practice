//check palindrome 
import  java.util.Scanner;
public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String orgstr=str;
        char [] arr=str.toCharArray();
        int l=0;
        int r=arr.length-1;
        while(l<r)
        {
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        String str2=new String(arr);
        if(str2.equals(orgstr))
        {
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}
