package Ch9_AdvancedArrays;

public class TestEmployee {

    public static void main(String[] args) {
        final int NUM_OF_EMPLOYEES = 5;
        final int SALARY_FACTOR = 50_000;
        final int BASE_PAY = 30_000;
        int x, y;
        Employee[] someEmps = new Employee[NUM_OF_EMPLOYEES];

        for( x=0; x<NUM_OF_EMPLOYEES; x++) {
            int nonzeroX = x+1;
            Employee emp = new Employee();
            someEmps[x] = emp;
            emp.setEmpNum(nonzeroX);
            emp.setFirstName("Employee" + nonzeroX);
            emp.setLastName("Lastname" + nonzeroX);
            double salary;
            double inverseX = 1.0/nonzeroX;
            salary = (inverseX * SALARY_FACTOR) + BASE_PAY;
            emp.setSalary(salary);
        }

        bubbleSort(someEmps);

        for (y=0; y<NUM_OF_EMPLOYEES; y++) {
            System.out.println(someEmps[y].getSalary());
            System.out.println(someEmps[y].getFirstName());
        }
    }
    public static void bubbleSort(Employee[] array) {
        int a, b;
        Employee temp;
        int highSubscript = array.length - 1;

        for (a = 0; a < highSubscript; a++) {

            for (b = 0; b < highSubscript; b++) {

                if (array[b].getSalary() > array[b + 1].getSalary()) {
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
        }

    }
}
