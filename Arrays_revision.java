import java.util.Arrays;
import java.util.Collections;

public class Arrays_revision {
    
    public static int linear_search(int a[],int key){
        System.out.println("Searching using Linear Search");
        for (int i = 0; i < a.length; i++) {
            if (a[i]==key) {
                return i;                           //Time complexity = O(n) 
            }                                       //Space complexity = O(1)
        }
        return -1;  
    }               

    public static boolean binary_search(int a[],int key){   
        System.out.println("Searching using Binary Search");
        int start = 0;
        int end = a.length-1;
        while (start<=end) {
            int mid = (start+end)/2;                //Disadvantage: array should be sorted
            if (a[mid]>key) {                       //Time complexity = O(log n)
                end = mid - 1;                      //Space = O(1)
            }
            else if (a[mid]<key) {
                start = mid + 1;
            }
            else {
                return true;
            }              
        }
        return false;      
    }                      

    public static void pairs(int a[]) {
        System.out.println("All possible unique pairs are: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {      //Time complexity = O(n2)
                System.out.print("("+a[i]+","+a[j]+")");//Space complexity = O(1)
            }
            System.out.println();
        }
    }

    public static void subarrays(int a[]) {
        System.out.println("All possible subarrays are: ");
        for (int i = 0; i < a.length; i++) {
            int start = i;
            for (int j = i; j < a.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {   //Time complexity = O(n3)
                    System.out.print(a[k]+" ");        //Space complexity = O(1)
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static int max_subarray_sum(int a[]) {      //Brute force approach
        System.out.println("Finding max subarray sum using brute force approach");
        int largest = a[0];
        for (int i = 0; i < a.length; i++) {
            int start = i;
            for (int j = i; j < a.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {   //Time complexity = O(n3)
                    sum+=a[k];                         //Space complexity = O(1)
                }
                if (sum > largest) {
                    largest = sum;
                }
            }
        }
        return largest;
    }

    public static int prefix_sum(int a[]) {      //Prefix sum approach
        System.out.println("Finding max subarray sum using prefix sum approach");
        int largest = a[0];
        int sum[] = new int[a.length];
        sum[0] = a[0];
        for (int i = 1; i < a.length; i++) {     //Time complexity = O(n2)
            sum[i] = sum[i-1] + a[i];            //Space complexity = O(n)
        }
        for (int i = 0; i < sum.length; i++) {
            for (int j = i+1; j < sum.length; j++) {
                int curr_sum = (i==0) ? sum[j] : sum[j] - sum[i-1];
                if (curr_sum > largest) {
                    largest = curr_sum;
                }
            }
        }
        return largest;
    }

    public static int kadanes(int a[]) {         //Using Kadane's algorithm
        System.out.println("Finding max subarray sum using kadane's algorithm");
        int curr_sum = 0;
        int max_sum = 0;
        for (int i = 0; i < a.length; i++) {     
            curr_sum+=a[i];                      
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }                                     //Time complexity = O(n)
        }                                         //Space complexity = O(1)
        if (max_sum == 0) {
            max_sum = Integer.MIN_VALUE;
            for (int i = 0; i < a.length; i++) {
                if (a[i] > max_sum) {
                    max_sum = a[i];
                }
            }
        }
        return max_sum;
    }

    public static void bubble_sort(int a[]) {
        System.out.println("Sorting using bubble sort");
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]) {
                    int temp = a[i];                    //Time complexity = O(n2) -> poor
                    a[i] = a[j];                        //Space complexity = O(1)
                    a[j] = temp;
                }
            }
        }           
    }               

    public static void selection_sort(int a[]) {
        System.out.println("Sorting using selection sort");
        for (int i = 0; i < a.length; i++) {
            int minpos = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[minpos]) {             
                    minpos = j;                 //Time complexity = O(n2)
                }                               //Space complexity = O(1)
            }
            int temp = a[i];
            a[i] = a[minpos];
            a[minpos] = temp;
        }
    }

    public static void insertion_sort(int a[]) {
        System.out.println("Sorting using insertion sort");
        for (int i = 1; i < a.length; i++) {
            int curr = a[i];                     //Time complexity = O(n2)
            int prev = i-1;                      //Space complexity = O(1)
            while (prev >= 0 && a[prev] > curr) {
                a[prev+1] = a[prev];
                prev--;
            }
            a[prev+1] = curr;
        }
    }

    public static void counting_sort(int a[]) {
        System.out.println("Sorting using counting sort");
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        int freq[] = new int[max+1];
        for (int i = 0; i < a.length; i++) {    //Time complexity = O(n + max)
            freq[a[i]]++;                       //Space complexity = O(max)
        }
        int c=0;
        for (int i = 0; i < freq.length; i++) { //Used for positive numbers only
            while (freq[i]>0) {
                a[c++]=i;
                freq[i]--;
            }
        }
    }

    public static void print_array(int a[]){
        for (int i = 0; i < a.length; i++) {            //Time complexity = O(n)
            System.out.print(a[i]+" ");                 //Space complexity = O(1)
        }               
    }                   
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        // Arrays.sort(arr); //inbulit sort Time complexity = O(nlog n)
        // Arrays.sort(arr,0,4);   //to sort a section of the array
        // // Arrays.sort(arr,Collections.reverseOrder()); -> to sort in descending order. Works only on Integer array not int array
        counting_sort(arr);
        print_array(arr);
    }
}
