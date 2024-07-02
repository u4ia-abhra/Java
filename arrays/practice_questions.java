public class practice_questions {

    public static int count7(int a[][]) {
        int c=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j]==7) {
                    c++;
                }
            }
        }
        return c;
    }

    public static void transpose(int a[][]){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }

    public static void printArray(int a[][]){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
         int a[][]={{1,4,9},{11,4,3},{2,2,3}};
        // System.out.println("Frequency of 7 = "+count7(a));
        // int sum = 0;
        // for (int i = 0; i < a.length; i++) {
        //     sum+=a[1][i];
        // }
        // System.out.println("Sum = "+sum);
        System.out.println("Matrix: ");
        printArray(a);
        System.out.println("Transpose: ");
        transpose(a);
        printArray(a);
    }    
}