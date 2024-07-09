class Merge_sort {

    public static void mergeSort(int a[],int si,int ei) {
        if (si>=ei) {
            return;
        }
        int mid = si + (ei-si)/2; //mid = (si+ei)/2
        mergeSort(a, si, mid);
        mergeSort(a, mid+1, ei);
        merge(a,si,ei,mid);
    }
    public static void merge(int a[],int si,int ei,int mid) {
        int temp[] = new int[ei-si+1];
        int i=si;   //for traversing left array
        int j=mid+1;    //for traversing right array
        int k=0;    //for traversing temp array
        while (i<=mid && j<=ei) {
            if (a[i]<a[j]) {
                temp[k++]=a[i++];
            }
            else {
                temp[k++]=a[j++];
            }
        }
        while (i<=mid) {
            temp[k++] = a[i++];
        }
        while (j<=ei) {
            temp[k++] = a[j++];
        }
        for (k=0,i=si;k<temp.length;k++,i++){
            a[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}