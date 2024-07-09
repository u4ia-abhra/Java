public class Remove_duplicates {
    public static String check(String s,int i) {
        if (i == s.length()-1) {
            return Character.toString(s.charAt(i));
        }
        if (s.charAt(i) == s.charAt(i+1)) {
            return check(s, i+1);
        }
        else {
            return s.charAt(i)+check(s, i+1);
        }
    }
    public static void main(String[] args) {
        String s = "appnnacollege";
        System.out.println(check(s, 0));
    }
}
