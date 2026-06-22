//package String;

class ReverseString {
    public static String reverseString(String s) {

        char[] arr = s.toCharArray();

        int l = 0;
        int h = arr.length - 1;

        while (l < h) {
            char temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;

            l++;
            h--;
        }

        String str = new String(arr);
        return str;
    }
}

/*String s = "hello";
String ans = "";

for (int i = s.length() - 1; i >= 0; i--) {
    ans += s.charAt(i);
}

System.out.println(ans);*/