import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the year: ");
        n=sc.nextInt();
        if (n%4==0) {
            if (n%100==0) {
                if (n%400==0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            } 
            else {
                System.out.println("Leap year");
            }
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
