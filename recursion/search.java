public class search {
    public static void check(int arr[], int i,int key) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i+" ");
        }
        check(arr, i+1, key);
    }

    public static void main(String[] args) {
        int a[] = {3,2,4,5,6,2,7,2,2};
        check(a, 0, 2);
    }
}
