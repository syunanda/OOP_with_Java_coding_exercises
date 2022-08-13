package Chapter5;

public class ShortCircuitTestOr {
    public static void main(String[] args) {
        if (falseMethod() || trueMethod()) {
            System.out.println("One is true");
        }
        else {
            System.out.println("Both are not true");
        }

    }
    private static boolean trueMethod(){
        System.out.println("Within trueMethod()");
        return true;
    }

    private static boolean falseMethod() {
        System.out.println("Within falseMethod()");
        return false;
    }
}
