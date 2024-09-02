package patterns;

import java.util.Scanner;

public class Diamond {

    public static int pattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("   *");
            }
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("  *");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("         ");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number of Rows: ");
            int n = sc.nextInt();

            pattern(n);
        }
    }

}
