public class subarray_max_sum {
    public static void main(String[] args) {
        int a[]={1,2,-3,4,-5,0};
        int n = a.length;
        int max_sum = a[0];
        for(int i=0;i<n;i++){
            for (int j = i; j < a.length; j++) {
                int curr_sum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    curr_sum+=a[j2];
                }
                if (curr_sum > max_sum) {
                    max_sum = curr_sum;
                }
            }
        }
        System.out.println("Maximum subarray sum = "+max_sum);
    }
}