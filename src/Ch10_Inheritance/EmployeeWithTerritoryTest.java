package Ch10_Inheritance;

public class EmployeeWithTerritoryTest {
    public static void main(String[] args) {
        EmployeeWithTerritory employee1 = new EmployeeWithTerritory();
        employee1.setFirstName("John");
        employee1.setLastName("Doe");
        employee1.setSalary(70_000.00);
        employee1.setTerritory("San Francisco Bay Area");

        System.out.println(employee1.getLastName() + ", " + employee1.getFirstName());
        System.out.println(employee1.getTerritory());
    }
}
