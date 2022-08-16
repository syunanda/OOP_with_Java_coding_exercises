package Ch10_Inheritance;

import Ch9_AdvancedArrays.Employee;

public class EmployeeWithTerritory extends Employee {
    private String territory;
    public void setTerritory(String terr) {
        territory = terr;
    }
    public String getTerritory() {
        return territory;
    }

}
