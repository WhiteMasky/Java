public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee("xx");
        Employee employee2 = new Employee("rr");

        employee1.setAge(10);
        employee1.setDesignation("Ablaabl");
        employee1.setSalary(10000);
        employee1.printEmployee();

        employee2.setAge(20);
        employee2.setDesignation("Boss");
        employee2.setSalary(1233456);
        employee2.printEmployee();
    }


}
