import java.util.Scanner;

public class odd_even {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a= sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        
        if(a%2==0){
            System.out.println(a + " is Even");
        }
    
        else{
            System.out.println(a + " is Odd");
        }

        if(b%2==0){
            System.out.println(b + " is Even");
        }
    
        else{
            System.out.println(b + " is Odd");
        }
    }
        
}
