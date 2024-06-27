import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter 1st operand: ");
        a=sc.nextInt();
        System.out.println("Enter 2nd operand: ");
        b=sc.nextInt();
        char c;
        System.out.println("Enter \n'+' for addition\n'-' for subtraction\n'*' for multiplication\n' /' for division\n'%' for modulus");
        c=sc.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a+b));
                break; 
            case '-':
                System.out.println(a + " - " + b + " = " + (a-b));
                break;    
            case '*':
                System.out.println(a + " * " + b + " = " + (a*b));
                break;      
            case '/':
                System.out.println(a + " / " + b + " = " + (a/b));
                break; 
            case '%':
                System.out.println(a + " % " + b + " = " + (a%b));
            default:
                System.out.println("Invalid Input");
                break;
        }
    } 
}
