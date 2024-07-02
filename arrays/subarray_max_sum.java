public class subarray_max_sum {

    public static int bruteForce(int a[]){
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
        return max_sum;
    }

    public static int prefix_array(int a[]){
        int n = a.length;
        int psum[] = new int[n];
        psum[0] = a[0];
        for(int i=1;i<n;i++){
            psum[i]=psum[i-1]+a[i];
        }
        int max_sum = a[0];
        for (int i = 0; i < psum.length; i++) {
            int curr_sum = 0;
            for (int j = i; j < psum.length; j++) {
                curr_sum = a[j]
            }
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int a[]={1,2,-3,4,-5,0};        
        System.out.println("Maximum subarray sum = "+bruteForce(a));
    }
}