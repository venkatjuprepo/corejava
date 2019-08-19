public abstract class AbstractStatic {
    public static void main(String[] argv) {
        System.out.println("Hello. The answer is yes.");
        // The following is redundant, since we got in here!
        AbstractStatic.foo();
    }

    public static void foo() {
        System.out.println("Hello from foo. The answer is still yes.");
    }
}
