import java.util.Scanner;

public class practice {

    public double Average(int a,int b,int c)
    {
        return (a+b+c)/3.0;
    }

    public boolean isEven(int n)
    {
        if (n%2==0) {
            return true;
        }
        else {
            return false;
        }
    }

    public int reverse(int n)
    {
        int sum=0;
        while (n>0) {            
            sum=sum*10+n%10;
            n/=10;
        }
        return sum;
    }

    public boolean pallindrome(int n)
    {
        if (n == reverse(n)) {
            return true;
        }
        else {
            return false;
        }
    }

    public int sum_of_digits(int n)
    {
        int sum = 0;
        while (n>0) {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        practice ob = new practice();
        // System.out.println("Enter three numbers:");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println("Average = "+ob.Average(a, b, c));
        // System.out.println("Enter the number to be checked: ");
        // int n = sc.nextInt();
        // System.out.println(n+" is even: "+ob.isEven(n));
        // System.out.println("Enter the number to be checked: ");
        // int n = sc.nextInt();
        // System.out.println(n+" is pallindrome: "+ob.pallindrome(n));
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of Digits = "+ob.sum_of_digits(n));
    }
}
