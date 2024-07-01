public class spiral_matrix {

    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int start_row = 0;
        int start_column = 0;
        int end_row = a.length-1;
        int end_column = a[0].length-1;
        while (start_row <= end_row && start_column <= end_column) {
            //top
            for(int i=start_column;i<=end_column;i++){
                System.out.print(a[start_row][i]+" ");
            }
            //right
            for(int i=start_row+1;i<=end_row;i++){
                System.out.print(a[i][end_column]+" ");
            }
            //bottom
            for(int i=end_column-1;i>=start_column;i--){
                System.out.print(a[end_row][i]+" ");
            }
            //left
            for(int i=end_row-1;i>start_row;i--){
                System.out.print(a[i][start_column]+" ");
            }
            start_column++;
            start_row++;
            end_column--;
            end_row--;
        }
    }
}