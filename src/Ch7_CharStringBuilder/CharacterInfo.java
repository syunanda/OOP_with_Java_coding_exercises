package Ch7_CharStringBuilder;

public class CharacterInfo {
    public static void main(String[] args) {
        char aChar = 'd';
        System.out.println("The character is " + aChar);

        if (Character.isUpperCase(aChar))
            System.out.println(aChar + " is uppercase");
        if (Character.isLowerCase(aChar)) {
            System.out.println(aChar + " is lowercase");
            aChar = Character.toUpperCase(aChar);
            System.out.println("The uppercase of character is " + aChar);
        }
        if (Character.isLetterOrDigit(aChar))
            System.out.println(aChar + " is a letter or a digit");
        else
            System.out.println(aChar + " is neither a letter nor a digit");

        if (Character.isWhitespace(aChar))
            System.out.println(aChar + " is whitespace");
        else
            System.out.println(aChar + " is not whitespace");


    }
}
