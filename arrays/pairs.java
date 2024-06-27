//WAP in java to print all possible pairs in an array

import java.util.Scanner;

class pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Elements"+(i+1)+" = ");
            a[i]=sc.nextInt();
        }
        System.out.println("The possible pairs of arrays are: ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + a[i] + "," + a[j] + ") ");
            }
            System.out.println();
        }
    }
}