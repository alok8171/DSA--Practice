public class countDigitInString {
    public static void main(String[] args) {
        String str="alok8171";
        char[] arr=str.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            char ch=str.charAt(i);
            if(Character.isDigit(ch))
            {
                continue;
            }
            else{
                count++;
            }
        }
        System.out.println(count);
    }
}
