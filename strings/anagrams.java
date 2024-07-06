import java.util.Arrays;
import java.util.Scanner;

public class anagrams {

    public static boolean isAnagram(String s1,String s2) {
        char a[] = s1.toCharArray();            //so that we can use inbuit functions of Arrays
        char b[] = s2.toCharArray();
        Arrays.sort(a);                         //inbilt sort function           
        Arrays.sort(b);
        if (Arrays.equals(a,b)) {
            return true;                //No loops used
                                        //Time complexity = O(s1.length + s2.length)
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter 2nd string: ");
        String s2 = sc.nextLine();
        s1.toLowerCase();//so that we don't have to compare for uppercase seperately
        s2.toLowerCase();
        if (isAnagram(s1,s2)) {
            System.out.println(s1+" and "+s2+" are Anagrams.");
        }
        else {
            System.out.println(s1+" and "+s2+" are not Anagrams.");
        }
    }
}