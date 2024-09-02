package Array;
import java.util.Scanner;

public class B_linera_search {

    public static int LinearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter The Key: ");
            int numbers[]= {1,2,3,4,5,6,7,8,9,10};
            int key= sc.nextInt();
    
            int index= LinearSearch(numbers,key);
    
            if(index==-1){
                System.out.println("Element not Found.");
            }
            else{
                System.out.println("Your Element is at Position "+ (index+1));
            }
        }
        
    }
}
