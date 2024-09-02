package Array;

public class C_Largest_numbers {

    public static int largest(int numbers[]){
        int big=numbers[0];
        for(int i=1 ;i<numbers.length; i++){
            if(big<numbers[i]){
                big = numbers[i];
            }
        }
        return big; 
    }
    
    public static void main(String args[]){
        int numbers[]={1,5,3,7,4,9,8};

        int big= largest(numbers);

        System.out.println("The biggest numbers in the array is: " + big);
    }
}
