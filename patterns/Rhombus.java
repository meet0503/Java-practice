package patterns;
import java.util.Scanner;


public class Rhombus {

    public static int rows(int n){
        for(int i=1; i<=n; i++){
            for(int s=1; s<=n-i; s++){
                System.out.print("  ");
            }
            for(int j=1; j<=n; j++){
                System.out.print(" * ");
            }
            // for(int i=1; i<=n; i++){
            //     for(int j=1; j<=n-i+1; j++){
            //         System.out.print("- ");
            //     }
            //     for(int j=1; j<=n; j++){
            //         System.out.print("| ");
            //     }
            //     for(int j=1; j<=i; j++){
            //         System.out.print("- ");
            //     }
            //     System.out.println();
            // }
            System.out.println();

        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter the Number of Lines: ");
            int n = sc.nextInt();
    
            rows(n);
        }
        
    }
}
