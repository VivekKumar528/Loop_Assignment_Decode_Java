import java.util.*;
public class SumOfNaturalN_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=0; i<=num; i++){
            sum += i;
        }
        System.out.println("The sum of " + num + " natural numbers = " + sum);
    }
}
