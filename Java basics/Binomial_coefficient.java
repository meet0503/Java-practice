import java.util.Scanner;

public class Binomial_coefficient {

    public static double factor(double n){
        double f=1;
        for(int i=1;i<=n;i++){
            f*=i;            
        }
        return f;
    }

    public static double binomialcoefficient(double n, double r){
        double nfact=factor(n);
        double rfact=factor(r);
        double nmrfact=factor(n-r);

        double result= nfact/(rfact*nmrfact);
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter The N: ");
            double n = sc.nextInt();
            System.out.print("Enter The R: ");
            double r = sc.nextInt();
            
            
            System.out.println("Binomial Coefficient of Number is: " + binomialcoefficient(n, r));
        }       
    }   
    
}
