package Array;

public class F_Pairs_in_arrays {

    public static void pairs(int arr[]){
        int length= arr.length;
        int tp=0;
        for(int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                System.out.print("("+ arr[i] + "," + arr[j] + ")" + " ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Numbers of Pair's are " + tp);
    }
    
    public static void main(String args[]){
        int arr[]={2,3,4,5,6,7,8,9};

        pairs(arr);
    }
}
