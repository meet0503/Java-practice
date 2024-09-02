package Array;

public class G_Sub_arrays {
    public static void SubArray(int arr[]){
        int length= arr.length;
        int ts=0;
        int maxsum=0;
        for(int i=0; i<length; i++){
            int start = i;
            for(int j=i; j<length; j++){
                int end = j;
                int sum=0, min=0, max=0;
                for(int k=start; k<=end; k++){
                    System.out.print(" " + arr[k] + " |");
                    sum=sum+arr[k]; //To calculate sum of each Sub array
                    min=arr[i];
                    max=arr[j];
                    if(min>max){   //For finding max and min elements in each sum array
                        int temp=min;
                        min=max;
                        max=temp;
                    }
                    if(maxsum<sum){ //For finding maximum Sum
                        maxsum=sum;
                    }
                }
                ts++;
                System.out.println("___      ==> Sum = " + sum + "__min = " + min + "__max = " + max);
            }
            System.out.println();
        }
        System.out.println("Total Subarray = " + ts);
        System.out.println("Maximum Sum = " + maxsum);
    }

    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};

        SubArray(arr);
    }
    
}
