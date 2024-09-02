package patterns;

import java.util.Scanner;

public class Inverted_Number {

    public static int pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
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
