package day35_EncapsulationOOP1.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tahir", 'M', 30, 120000);

        System.out.println("employee1 = " + employee1);

        employee1.setAge(32);

        System.out.println("employee1 = " + employee1);

        Employee employee2 = new Employee("Aygun", 'F', 31, 115000);
        System.out.println("employee2 = " + employee2);

        employee2.setName("Elvira");
        System.out.println("employee2 = " + employee2);
        employee2.setSalary( employee2.getSalary() + 15000 );
        System.out.println("employee2 = " + employee2);

    }
}
