import java.util.Scanner;

public class decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int n = sc.nextInt();
        int c=0,sum=0,m=n;
        while (n>0) {
            sum+=(n%10)*(int)Math.pow(2, c++);
            n/=10;
        }
        System.out.println("The decimal equivalent of "+m+" is "+sum);
    }
}
