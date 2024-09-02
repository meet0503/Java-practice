import java.util.Scanner;

public class prime_no {

    public static boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    // public static boolean isprime(int n){
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
  
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Enter the Number: ");
            int n = sc.nextInt();
            if(n==1){
                System.out.println("Neither Prime nor Composite.");
            }

            else{
                System.out.println(isprime(n));
            }            
        }
    }   
}
