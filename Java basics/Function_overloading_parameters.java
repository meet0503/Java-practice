public class Function_overloading_parameters {

    public static int sum(int a, int b){
        return a+b;
    } 

    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        int a=6;
        int b=5;
        int c=3;

        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
    }
}