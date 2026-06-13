public class targetSum {
    public static void main(String[] args) {
        int[] arr={2,4,8,10,11};
        int target=1200;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println("target found");
                    System.exit(0);
                }
            }
           
        }
        System.out.println("target not found");
    }
}
