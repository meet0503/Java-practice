import java.util.Scanner;

public class basic {
    public static void main(String args[]) {
        System.out.print("Enter Your Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Enter Value of INT type: ");
        int a = sc.nextInt();
        System.out.print("Enter Value of FLOAT type: ");
        float b = sc.nextFloat();

        System.out.println("Your name: " + name);
        System.out.println("Sum is :"+ (a+b));
        System.out.println("Product is :" + (a*b));
    }
}