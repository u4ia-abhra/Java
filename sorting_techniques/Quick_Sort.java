public class Quick_Sort {
    public static void quickSort(int a[],int si,int ei){
        if (si>=ei) {
            return;
        }
        int pi = partition(a,si,ei);
        quickSort(a, si, pi-1);
        quickSort(a, pi+1, ei);
    }

    public static int partition(int a[],int si,int ei){
        int i=si-1;
        int pivot = a[ei];
        for (int j = si; j <= ei; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5,-6};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
