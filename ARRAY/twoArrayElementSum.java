//array ke 2 elemnt ka sum target ke barabar aaye
public class twoArrayElementSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 8, -3};
        int target = 74;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // FIXED
                if (arr[i] + arr[j] == target) {
                    found = true;
                    System.out.println("target found: " + arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }

        if (!found) {
            System.out.println("target not find");
        }
    }
}



    
     
