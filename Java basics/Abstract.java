abstract class A {
    public abstract void show();
}

class B extends A {
    public void show() {
        System.out.println("Show");

    }

}

public class Abstract {
    public static void main(String[] args) {

        A obj = new B();
        obj.show();

    }

}
