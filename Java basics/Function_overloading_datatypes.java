import java.util.Scanner;

public class Function_overloading_datatypes {

    public static int sum(int a, int b){
        return a+b;
    }

    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String args[]){
        
        System.out.println(sum(3, 4));
        System.out.println(sum(3.3f, 4.4f));
        

    }
    
}
