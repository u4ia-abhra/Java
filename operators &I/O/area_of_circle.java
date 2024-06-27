import java.util.Scanner;
public class area_of_circle
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the cicle");
        int r=sc.nextInt();
        float area = 3.14f * r * r;
        System.out.println("Area of circle = "+area);
    }
}
