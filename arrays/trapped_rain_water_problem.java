import java.util.Scanner;

public class trapped_rain_water_problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]={4,2,1,3,1,4,2};
        int  width=1,sum=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (a[j-1]>=a[j]) {
                    int water_level=Math.min(a[i],a[j-1]);
                    System.out.println("Water level = "+water_level);
                    for(int k=i;k<j;k++){
                        int t = (water_level-a[k])*width;
                        if (t>0) {
                            sum+=t;
                        }
                        System.out.println(t);
                    }
                    i=j-1;
                }
            }            
        }
        System.out.println("Total water trapped = "+sum);
    }
}