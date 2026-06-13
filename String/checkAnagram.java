// string Anagaram checker
import java.util.Arrays;

public class checkAnagram {
    public static void main(String [] args)
    {
              String str="silent";
              String str2="listenz";

              char [] arr1=str.toCharArray();
              char [] arr2=str2.toCharArray();

              Arrays.sort(arr1);
              Arrays.sort(arr2);

              if(Arrays.equals(arr1, arr2))
              {
                System.out.println("string is anagaram ");
              }
              else{
                System.out.println("not anagaram");
              }
    }
}
