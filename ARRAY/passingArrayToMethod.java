//passing array to method

public class passingArrayToMethod {
    public static void main(String[] args) 
    {
        int[] arr={14,12,4,5};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);
    }

    public static void change(int[] y)
    {
        y[2]=99;
    }
}

