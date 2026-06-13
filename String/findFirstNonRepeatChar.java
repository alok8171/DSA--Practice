
//find 
//find firstNonRepeatChar

public class findFirstNonRepeatChar {
    public static void main(String[] args) {
        String str="aacbcccccccccc";
        char[] arr=str.toCharArray();
       int[] freq = new int[256];

        // count
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // find first non-repeating
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 2) {
                System.out.println("First non-repeating: " + str.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeating character");
    }
    }

