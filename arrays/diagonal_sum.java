import java.util.Scanner;

public class diagonal_sum {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of rows: ");
        // int n = sc.nextInt();
        // int a[][]=new int[n][n];
        // System.out.println("Enter the elements of the array:");            
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         a[i][j]=sc.nextInt();
        // }        
        int sum = 0;
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a[0].length; j++) {
        //         if (i==j) {
        //             sum+=a[i][j];
        //         }
        //         if (j==a.length-i-1 && i!=j) {
        //             sum+=a[i][j];
        //         }
        //     }                                    //Time complexity = O(n2)
        // }
        for (int i = 0; i < a.length; i++) {
            sum+=a[i][i];
            if (i==(a.length-i-1)) {
                continue;                            //Time complexity = O(n)
            }
            sum+=a[i][a.length-i-1];
        }
        System.out.println("Sum of diagonal elements = "+sum);
    }
}
