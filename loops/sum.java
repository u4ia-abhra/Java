import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,odd=0,even=0;
        System.out.println("Enter the number of terms: ");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter a number: ");
            int t=sc.nextInt();
            if (t%2==0) {
                even+=t;
            }
            else {
                odd+=t;
            }
        }
        System.out.println("Sum of even numbers = "+even);
        System.out.println("Sum of odd numbers = "+odd);
    }
}
