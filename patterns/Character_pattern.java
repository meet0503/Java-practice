package patterns;
/*
A   
B C 
D E F
G H I J
 */
import java.util.Scanner;


public class Character_pattern {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = 'A';

        System.out.print("Enter the Number of lines: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int chars=1;chars<=i;chars++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
