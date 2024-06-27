import java.util.Scanner;

public class area_of_square {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the side of the square: ");
        n=sc.nextInt();
        int area = n*n;
        System.out.println("Area of square = "+area);
    }
}