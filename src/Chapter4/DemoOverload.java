package Chapter4;

public class DemoOverload
{
    public static void main(String[] args) {
        int month = 8, day = 8, year = 2022;
        displayDate(month);
        displayDate(month, day);
        displayDate(month, day, year);
    }

    public static void displayDate(int month)
    {
        System.out.println("Event date " + month + "/8/2022");
    }

    public static void displayDate (int month, int day)
    {
        System.out.println("Event date " + month + "/" + day + "/2022");
    }

    public static void displayDate ( int month, int day, int year)
    {
        System.out.println("Event date " + month + "/" + day + "/" + year);
    }
}
