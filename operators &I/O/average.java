import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three numbers:");;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        float average=(a+b+c)/3.0f;
        System.out.println("Average = "+average);
    }
}
