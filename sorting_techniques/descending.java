public class descending {
    public static void BubbleSort(int a[]){
        System.out.println("Using Bubble Sort");
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (a[i]<a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int a[]){
        System.out.println("Using Selection Sort");
        int n=a.length;
        for(int i=0;i<n;i++){
            int maxpos = i;
            for(int j=i+1;j<n;j++){
                if (a[maxpos]<a[j]) {
                    maxpos=j;
                }
            }
            int temp = a[i];
            a[i] = a[maxpos];
            a[maxpos] = temp;
        }
    }

    public static void InsertionSort(int a[]){
        System.out.println("Using Insertion Sort");
        int n=a.length;
        for(int i=1;i<n;i++){
            int curr = a[i];
            int prev = i-1;
            while (prev>=0 && a[prev] < curr) {
                a[prev+1] = a[prev];
                prev--;
            }
            a[prev+1] = curr;
        }
    }

    public static void CountingSort(int a[]){
        System.out.println("Using Counting Sort");
        int n=a.length;
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            largest = Math.max(largest, a[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<n;i++){
            count[a[i]]++;
        }
        int c=0;
        for(int i=largest;i>=0;i--){
            while (count[i]>0) {
                a[c++]=i;                
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {132,87,26,0,1111,12};
        // BubbleSort(a);
        // SelectionSort(a);
        // InsertionSort(a);
        CountingSort(a);
        int n=a.length;
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}