public class ReverseArray {
    public static void main(String[] args)
     {
       int[] arr={14,12,4,8,74,17};
     int  n=arr.length; 
     int i=0;
     int j=n-1;
     while(i<j)
     {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
     }
     for(int element:arr)
     {
        System.out.println(element);
     }
     
    }
}
