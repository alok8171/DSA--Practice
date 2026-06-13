
public class mergesSort {
     

    public static void main(String[] args) {

     int[] arr = {15, 5, 24, 8, 1, 3, 16, 10, 20};
        
        
        System.out.println("Before Sorting:");
        for (int ele : arr) {
            System.out.print(" " + ele);
        }

        int lb = 0;
        int ub = arr.length - 1;
       // int k=0;

        mergeSort(arr, lb, ub);   
       
        System.out.println("after Sorting:\n");
        for (int ele : arr) {
            System.out.print(" " + ele);
        }
    }

    static void mergeSort(int[] arr, int lb, int ub) {

        if (lb < ub) {

            int mid = (lb + ub) / 2;

            mergeSort(arr, lb, mid);
            mergeSort(arr, mid + 1, ub);

             merge(arr, lb, mid, ub);  
        }
    }
  static void merge(int[] arr, int lb, int mid, int ub)
       {
         int[] b=new int[arr.length];
            int i=lb;
            int j=mid+1;
            int k=lb;
            while(i<=mid && j<=ub)
            {
                if(arr[i]<=arr[j])
                {
                    b[k]=arr[i];
                    i++;
                }
                else{
                    b[k]=arr[j];
                    j++;
                }
                k++;
            }
            if(i>mid)
            {
                while(j<=ub)
                {
                    b[k]=arr[j];
                    j++;
                    k++;
                }
            }
            else{
                while(i<=mid)
                {
                    b[k]=arr[i];
                    i++;
                    k++;

                }
            }
            
        for (int x = lb; x <= ub; x++) {
            arr[x] = b[x];
            

       }


    }





}
