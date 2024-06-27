import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int n = sc.nextInt();
        int sum=0,c=0,m=n;
        while (n>0) {
            sum+=(n%2)*(int)Math.pow(10,c++);
            n/=2;
        }
        System.out.println("The binary equivalent of "+m+" is "+sum);
    }
}
