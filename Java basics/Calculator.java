import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number: ");
        int a= sc.nextInt();

        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("Enter the Operator ( + , - , * , / , % )");
        char Operator = sc.next().charAt(0);

        switch(Operator) {
            case '+' : System.out.println("Sum is: " + (a+b));
                        break;
            case '-' : System.out.println("Difference is: " + (a-b));
                        break;
            case '*' : System.out.println("Product is: " + (a*b));
                        break;
            case '/' : System.out.println("Division is: " + (a/b));
                        break;
            case '%' : System.out.println("Remainder is: " + (a%b));
                        break;
            default : System.out.println("Invalid Operator");
                        break;
        }
    }
    
}
