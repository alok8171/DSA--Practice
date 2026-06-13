public class countconsonants {
    public static void main(String[] args) {
        String str="aloksingh";
        char[] arr=str.toCharArray();
        int count=0;
        
        for(int i=0;i<arr.length;i++)
        {
            char ch=str.charAt(i);
            if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u')
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
