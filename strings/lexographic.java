public class lexographic {

    public static String findLargest(String s[]){
        String largest = s[0];
        for (int i = 0; i < s.length; i++) {
            if (largest.compareTo(s[i]) < 0) {
                largest = s[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String fruits[] = {"Apple","Banana","Mango","Watermelon","Orange"};
        System.out.println("Largest = " + findLargest(fruits));
    }
}
