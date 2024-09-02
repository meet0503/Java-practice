public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // Without using third variable
        // a = a + b;
        // b = a - b;
        // a = a - b;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping " + a + " " + b);
    }

}
