public class find {

    public static int firstOccurence(int a[],int key,int i){
        if (i == a.length) {
            return -1;
        }
        if (a[i] == key) {
            return i;
        }
        return firstOccurence(a, key, i+1);
    }

    public static int lastOccurence(int a[],int key,int i) {
        if (i<0) {
            return -1;
        }
        if (a[i] == key) {
            return i;
        }
        return lastOccurence(a, key, i-1);       
    }
    public static void main(String[] args) {
        int a[] = {1,4,6,2,10,0};
        System.out.println("Index of first occurence = " + firstOccurence(a, 0, 0));
        System.out.println("Index of last occurence = " + lastOccurence(a, 0, a.length-1));
    }
}
