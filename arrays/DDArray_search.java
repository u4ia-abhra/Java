import java.util.Scanner;

class DDArray_search {

    public static void LinearSearch(int a[][],int key){
        for(int i=0;i<a.length;i++){
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == key) {
                    System.out.println("Found at ("+i+","+j+")");
                    return;
                }
            }           //Time complexity = O(n2) -> quadratic
        }
        System.out.println("Not found");
    }

    public static void BinarySearch(int a[][],int key){
        for(int i=0;i<a.length;i++){
            int start = 0;
            int end = a[0].length-1;
            while (start<=end) {
                int mid = (start+end)/2;
                if (key < a[i][mid]) {
                    end = mid-1;
                }
                else if (key > a[i][mid]) {
                    start = mid+1;
                }
                else {
                    System.out.println("Found at ("+i+","+mid+")");
                    return;
                }
            }               //Time complexity = O(nlog n) 
        }
        System.out.println("Not found");
    }

    public static void StaircaseSearch(int a[][],int key){
        int row = a.length-1;
        int column = 0;
        while (row >= 0 && column <= a[0].length) {
            if (key < a[row][column]) {
                row--;
            }
            else if (key > a[row][column]) {
                column++;
            }
            else {
                System.out.println("Found at ("+row+","+column+")");
                return;
            }                   //Time complexity = O(n+m) -> linear
        }                   
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{20,30,40,50},{100,300,500,700},{1000,10000,100000,1000000}}; //sorted array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        StaircaseSearch(a,key);
    }
}