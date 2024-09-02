package Array;

public class E_Reverse_array {

    public static void reverse(int arr[]){
        // int n = arr.length;
        // int run=n/2;
        // int temp = 0;
        // for(int i=0; i<run;i++){
        //     temp = arr[i];
        //     arr[i]=arr[n-i-1];
        //     arr[n-i-1]=temp;
        // }

        int first=0, last= arr.length-1;
        while(first<last){
            int temp= arr[first];
            arr[first]=arr[last];
            arr[last]=temp;

            first++;
            last--;
        }
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        reverse(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
