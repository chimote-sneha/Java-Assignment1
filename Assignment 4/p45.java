/**45) WAP to find out the sum of all the digits of a number */
import java.util.Scanner;

class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;  
            sum += digit;           
            temp /= 10;             
        }

        System.out.println("Sum of digits of " + num + " is: " + sum);
    }
}
