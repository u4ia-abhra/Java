import java.util.Scanner;;

public class prime {
    public boolean isPrime(int a)
    {
        for(int i=2;i<=Math.sqrt(a);i++)
        {
            if (a%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        prime ob = new prime();
        System.out.println("Enter the lower imit of the range: ");
        int n = sc.nextInt();
        System.out.println("Enter the upper imit of the range: ");
        int m = sc.nextInt();
        System.out.println("The prime numbers in the given range are: ");
        for(int i = n+1;i<m;i++)
        {
            if (ob.isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}