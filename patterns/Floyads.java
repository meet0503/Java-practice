package patterns;
import java.util.Scanner;


public class Floyads {

    public static int pattern(int n){
        int m = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(m+" ");
                m++;
                
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter number of Rows: ");
            int n=sc.nextInt();
    
            pattern(n);
        }
        
    }
}
