import java.util.Scanner;

public class Call_by_Value {

    public static int swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Value of A: " + a);
        
        System.out.println("Value of B: " + b);
        return 0;       
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the Value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter the Value of B: ");
        int b = sc.nextInt();

        swap(a,b);
    }
    
}
