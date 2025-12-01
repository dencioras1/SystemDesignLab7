public class Hello {


    public static int add(int a, int b) {
        return a - b;
    }


    public static void main(String[] args) {
        System.out.println("Hello, World! and others");

        epicMethod();

        System.out.println(add(1,2));

    }

    public static void epicMethod() {
        System.out.println("What's 9 + 10?");
    }
}
