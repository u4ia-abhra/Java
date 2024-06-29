import java.util.Scanner;

public class subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements: ");
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Element"+(i+1)+": ");
            a[i]=sc.nextInt();
        }
        int c=0;
        System.out.println("The subbarays are: ");
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();
                c++;
            }            
        }
        System.out.println("Number of subarrays = "+c);
    }
}
