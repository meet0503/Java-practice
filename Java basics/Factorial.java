import java.util.Scanner;

public class Factorial {
    
    public static long factor(long n){
        long f=1;
        for(int i=1;i<=n;i++){
            f*=i;            
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter The Number: ");
            long n = sc.nextInt();
            //int f = factor(n);
            System.out.println("Factorial of Number is: " + factor(n));
        }       
    }   
}

