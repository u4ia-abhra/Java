public class Majority {

    public static int check(int arr[]) {
        // for (int i = 0; i < arr.length; i++) {
        //     int c = 0;
        //     for (int j = i; j < arr.length; j++) {
        //         if (arr[i] == arr[j]) {
        //             c++;
        //         }
        //     }
        //     if (c > (arr.length/2)) {                //Time complexity = O(n2)
        //         return arr[i];
        //     }
        // }
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int temp[] = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (temp[arr[i]] > (arr.length/2)) {        //Time complexity = O(n)
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {3,2,3};
        System.out.println(check(a));
    }
}
