import java.util.Scanner;

public class BinaryToDecimal {

    public static int binToDec(int binNum) {
        int dec = 0;
        int pow = 0;

        while (binNum > 0) {
            int LD = binNum % 10;
            dec = dec + (LD * (int) Math.pow(2, pow));
            binNum = binNum / 10;
            pow++;
        }

        return dec;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter The Binary Number: ");
            int binNum = sc.nextInt();

            if (binNum % 10 == 0 || binNum % 10 == 1) {
                System.out.print("Decimal Number is " + binToDec(binNum) + "\n");
            } else {
                System.out.print(binNum + " is not a binary Number. \n");
            }

        }

    }
}
