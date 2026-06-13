import java.util.Scanner;

class countvowel
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
         char[] arr = str.toCharArray();
        int i=0,j=arr.length-1;
        while(i<j)
        {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String reversed = new String(arr);
        System.out.println(reversed);


    }
}