//Sorting Strings using Merge Sort
public class String_Sort {

    public static void merge_sort(String s[],int si,int ei) {
        if (si>=ei) {
            return;
        }
        int mid = si + (ei-si)/2;
        merge_sort(s, si, mid);
        merge_sort(s, mid+1, ei);
        merge(s, si, mid, ei);
    }

    public static void merge(String s[],int si,int mid,int ei) {
        String tempString[] = new String[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while (i<=mid && j<=ei) {
            if ((s[i].compareTo(s[j]))<0) {
                tempString[k++] = s[i++];
            }
            else {
                tempString[k++] = s[j++];
            }
        }
        while (i<=mid) {
            tempString[k++] = s[i++];
        }
        while (j<=ei) {
            tempString[k++] = s[j++];
        }
        for (k = 0, i = si; k < tempString.length; k++, i++) {
            s[i] = tempString[k];
        }
    }

    public static void main(String[] args) {
        String s[] = {"Mango","Watermelon","Apple","Banana","Orange"};
        merge_sort(s, 0, s.length-1);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }
}
