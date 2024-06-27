import java.util.Scanner;

class income_tax_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter taxable income: ");
        float n,tax;
        n=sc.nextFloat();
        if (n<=500000) {
            tax=0;            
        }
        else if (n<=1000000) {
            tax=(n-500000)*20/100;
        }
        else {
            tax=100000+(n-1000000)*30/100;
        }
        System.out.println("Tax payable = "+tax);
    }    
}