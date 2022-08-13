package Chapter3;

import Chapter3.Employee;

public class DeclareTwoEmployees {
    public static void main(String[] args) {

        Employee clerk = new Employee();
        clerk.setEmpFirstName("David");
        clerk.setEmpLastName("Clerk");
        clerk.setEmpNum(123);
        clerk.setEmpSalary(50000);

        Employee driver = new Employee();
        driver.setEmpFirstName("Neil");
        driver.setEmpLastName("Driver");
        driver.setEmpNum(234);
        driver.setEmpSalary(60000);

        System.out.println("The clerk's name is " +
                clerk.getEmpFirstName() + " " + clerk.getEmpLastName() +
                " and his number is " + clerk.getEmpNum()
        );

        System.out.println("The driver's name is " +
                driver.getEmpFirstName() + " " + driver.getEmpLastName() +
                " and his number is " + driver.getEmpNum()
        );

    }
}
