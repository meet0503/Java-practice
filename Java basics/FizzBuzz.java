import java.util.Scanner;

public class FizzBuzz {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the range: ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                String out = "    ";

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(out + "Fizz Buzz");
                } else if (i % 3 == 0) {
                    System.out.println(out + "Fizz");
                } else if (i % 5 == 0) {
                    System.out.println(out + "Buzz");
                } else {
                    System.out.println(out + i);
                }
            }
        }
    }
}
