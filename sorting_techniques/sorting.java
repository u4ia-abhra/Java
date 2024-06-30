public class sorting {
    public static void BubbleSort(int a[]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (a[i]>a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void SelectionSort(int a[]){
        int n=a.length;
        for(int i=0;i<n;i++){
            int minpos = i;
            for(int j=i+1;j<n;j++){
                if (a[minpos]>a[j]) {
                    minpos = j;
                }                
            }
            int temp = a[i];
            a[i] = a[minpos];
            a[minpos] = temp;
        }
    }
    public static void InsertionSort(int a[]){
        int n=a.length;
        for(int i=1;i<n;i++){
            int curr = a[i];
            int prev = i-1;
            while (prev>=0 && a[prev]>curr) {
                a[prev+1]=a[prev];
                prev--;
            }
            a[prev+1]=curr;
        }
    }

    public static void CountingSort(int a[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            largest=Math.max(largest, a[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<a.length;i++){
            count[a[i]]++;
        }
        int c=0;
        for(int i=0;i<largest;i++){
            while (count[i]>0) {
                a[c]=i;
                count[i]--;
                c++;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={30,29,69,100,1075,1,1606};
        CountingSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
