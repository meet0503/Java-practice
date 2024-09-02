import java.util.Scanner;

public class Multiple_inputs {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int i=1;

        while(i%10!=0){
            System.out.print("Enter The Number: ");
            i=sc.nextInt();
            
            if(i%10==0){
                System.out.print("You Have Entered a Multiple of 10.");
            }
            else{
                System.out.println("Your number is: " + i);
            }

            /*
             * int n;
             * do{
             *  System.out.print("Enter The Number: ");
             *  n=Sc.nextInt();
             *  if(i%10==0){
             *      System.out.print("You Have Entered a Multiple of 10.");
             *      break;
             *  }
             *  System.out.println("Your number is: " + i);
             * }while(true);
             */
        }
    }
}
