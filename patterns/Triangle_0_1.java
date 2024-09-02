package patterns;

import java.util.Scanner;


public class Triangle_0_1 {
    public static int pattern(int n){
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){

                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
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
    
            pattern(n);
        }
        
    }
    
}
