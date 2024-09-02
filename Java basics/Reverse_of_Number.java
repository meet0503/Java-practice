import java.util.Scanner;

public class Reverse_of_Number {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        int m = n; //for second while loop
        int a;

        System.out.print("Reversed of the Number is: ");
        while(n>0){
            a = n % 10;
            System.out.print(a);
            n/=10;
        }

        int rev = 0;
        while(m>0){
            int lastdigit = m % 10;
            rev = (rev*10) + lastdigit;
            m/=10; 
        }
        System.out.print("\nReversed of the Number is: " + rev);
    }   
}
