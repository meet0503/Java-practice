import java.util.Scanner;

public class Function_parameters{

    public static void calculatesum(int num1, int num2){ //num1 and num2 are parameters or formal parameters
         int sum = num1+num2;
         System.out.println("Sum is: " + sum);
    }

    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter the First Number: ");
         int a = sc.nextInt();
         System.out.print("Enter the Second Number: ");
         int b = sc.nextInt();

         calculatesum(a,b);//a and b are arguments or actual parameters
    }
}
