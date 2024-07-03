import java.util.Scanner;

public class String_compression {

    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer f=0;
            char ch = str.charAt(i);
            while ((i+f) < str.length() && str.charAt(i+f) == ch) {
                f++;
            }
            sb.append(ch);
            if (f>1) {
                sb.append(f.toString());
            }
            i+=f-1;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Compressed string = " + compress(str));
    }
}
