
//search element in an array
import java.util.Scanner;

public class SearchingElement {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
       // System.out.print("enter the no. of element: ");
       // int n=sc.nextInt();
        int[] arr={14,24,21,16,18};
        int target=18;
        boolean flag=false;
        int index=-1;
        for (int i = 0; i < 5; i++) {
            if(arr[i]==target)
            {
               flag=true;
                index=i;
               break;
               
            }
        } 
        if(flag)
        {
            System.out.println("element is found at " +index+"index");
        }
        else{
            System.out.println("element not found");
        }
                
            
        
        
        
        
    
        
        
        
    }
}
