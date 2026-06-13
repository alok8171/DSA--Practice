import java.util.Scanner;

public class countSpaceInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();   // 👈 full line with spaces

        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Number of spaces: " + count);
    }
}