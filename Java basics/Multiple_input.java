//Takes inputs and print it except multiple of 10.
import java.util.Scanner;

public class Multiple_input {
    public static void main(String args[]){
             
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter The Number: ");
            n=sc.nextInt();
            if(n%10==0){
                
                continue;
            }
            System.out.println("Your number is: " + n);
        }while(true);             
    }
}
