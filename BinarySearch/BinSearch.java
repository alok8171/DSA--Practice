import java.util.Scanner;

public class BinSearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element you want to search: ");
        int target = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index " + mid);
                found = true;
                break;
            } 
            else if (arr[mid] < target) {
                low = mid + 1;   // sirf range update
            } 
            else {
                high = mid - 1;  // sirf range update
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
