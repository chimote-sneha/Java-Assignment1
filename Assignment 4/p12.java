/**12) WAP to print Odd numbers upto N. */
import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the limit of the series : ");
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println("odd is : "+i);
            i+=2;
        
        }
    }
}