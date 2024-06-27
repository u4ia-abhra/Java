import java.util.Scanner;
class product
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        int product = a*b;
        System.out.println("Product = "+product);
    }
}