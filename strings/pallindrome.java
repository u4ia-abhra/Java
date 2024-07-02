import java.util.Scanner;

public class pallindrome {

    public static boolean isPallindrome(String str) {
        int n = str.length();
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(str+" is pallindrome: "+isPallindrome(str));
    }
}
