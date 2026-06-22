// leap year program
//A year is a Leap Year if it satisfies these properties:

/* If the year is divisible by 4, it is a leap year.

But if the year is divisible by 100, it is not a leap year.

However, if the year is also divisible by 400, then it is a leap year.  */

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%4==0  && n%100==0 && n%400==0)
        {
            System.out.println("it is leap year");
        }
        else{
            
            System.out.println(" it is not leap year");
        }
        
    }
}
