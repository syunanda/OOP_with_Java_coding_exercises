package Chapter7;

public class StringBuilderMethods {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("singing");
        System.out.println("The string is \n" + str);

        str.append(" in the dead of ");
        System.out.println("The  string after append method is \n" + str);

        str.insert(0, "Black ");
        System.out.println("The string after insertion at 0 is \n" + str);

        str.insert(5, "bird ");
        System.out.println("The string after insertion at 5 is \n" + str);

        str.append("night");
        System.out.println("The final string is \n" + str);
    }
}
