import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number of ap: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number of ap: ");
        int b=sc.nextInt();
        System.out.println("the the term which you want to know : ");
        int an=sc.nextInt();
        int d=b-a;
        int ansum= (an/2)*(2*a-(an-1)*d);
        System.out.println("terms sum you wants to know is :  "+ansum);
    }
}