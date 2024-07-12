public class length {
    public static int length (String str) {
        if (str.equals("")) {
            return 0;
        }
        return 1 + length(str.substring(1));
    }
    public static void main(String[] args) {
        System.out.println(length("abhrajit ghosh"));
    }
}
