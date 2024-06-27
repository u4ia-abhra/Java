import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("a = ");
        a=sc.nextInt();
        System.out.print("b = ");
        b=sc.nextInt();
        System.out.print("c = ");
        c=sc.nextInt();
        System.out.print("Largest = ");
        if (a>b) {
            if (a>c) {
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }            
        }
        else{
            if (b>c) {
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
    }
}
