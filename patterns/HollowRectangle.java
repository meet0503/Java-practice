package patterns;
import java.util.Scanner;

public class HollowRectangle {

    public static int rectangle(int total_rows , int total_columns){
        //outer loop-rows
        for(int i=1; i<=total_rows; i++){
            //inner loop-columns
            for(int j=1; j<=total_columns; j++){
                //cells-(i,j)
                if( i==1 || i==total_rows || j==1 || j==total_columns){
                    //Boundary cells
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
            System.out.print("Enter the Number of Rows: ");
            int total_rows = sc.nextInt();
            System.out.print("Enter the Number of Columns: ");
            int total_columns = sc.nextInt();
    
            rectangle(total_rows, total_columns);
        }
        
    }
}
