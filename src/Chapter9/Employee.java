package Chapter9;

public class Employee {
    private int empNum;
    private String lastName;
    private String firstName;
    private double salary;
    public int getEmpNum()
    {
        return empNum;
    }
    public void setEmpNum(int emp)
    {
        empNum = emp;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String name)
    {
        lastName = name;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String name)
    {
        firstName = name;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double sal)
    {
        salary = sal;
    }
}
