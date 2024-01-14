import java.util.*;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 0;
        int j = s.length() - 1;
        char left = s.charAt(0);
        char right = s.charAt(s.length() - 1);
        while(i < j){
            if(left != right) {
                System.out.println("Not Palindrome!");
                break;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome!");


    }
}
