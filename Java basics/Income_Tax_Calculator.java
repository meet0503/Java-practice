import java.util.Scanner;

public class Income_Tax_Calculator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Income: ");
        int income = sc.nextInt();
        float tax;
        if(income<500000){
            tax = 0;
            System.out.println( "According to your Income Your Tax is: " + tax);
        }
        else if(income>500000 && income<=1000000){
            tax = income * 0.2f;
            System.out.println( "According to your Income Your Tax is: " + tax);
        }
        else{
            tax = income * 0.3f;
            System.out.println( "According to your Income Your Tax is: " + tax);
        }
    }
}
