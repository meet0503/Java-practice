package patterns;
import java.util.Scanner;


public class Hollow_rhombus {

    public static int pattern(int n, int m){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=m; j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
                
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
    
            System.out.print("Enter number of columns: ");
            int m=sc.nextInt();
    
            pattern(n,m);
        }   
    }  
    
}
