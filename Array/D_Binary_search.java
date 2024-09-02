package Array;
import java.util.Scanner;

public class D_Binary_search {

    public static int BinarySearch(int numbers[], int key){
        int start=0, end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;    //right
            }
            else{
                end=mid-1;      //left
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter The Key: ");
            int key= sc.nextInt();
    
            int numbers[]= {1,2,3,4,5,6,7,8,9,10};
            
            int index= BinarySearch(numbers,key);
            if(index==-1){
                System.out.println("Element not Found.");
            }
            else{
                System.out.println("Your Element is at Position "+ (index+1));
            }
        }
        
    }
}
