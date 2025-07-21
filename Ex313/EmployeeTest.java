public class EmployeeTest {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee emp1 = new Employee("John", "Doe", 0);
        Employee emp2 = new Employee("Jane", "Doe", 4000);

        // Display yearly salaries before raise
        System.out.printf("%s %s - Yearly Salary: $%.2f%n",
            emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());

        System.out.printf("%s %s - Yearly Salary: $%.2f%n",
            emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());

        // Give both employees a 10% raise
        emp1.giveRaise(10);
        emp2.giveRaise(10);

        // Display yearly salaries after raise
        System.out.println("After 10% raise:");
        System.out.printf("%s %s - Yearly Salary: $%.2f%n",
            emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());

        System.out.printf("%s %s - Yearly Salary: $%.2f%n",
            emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());
    }
}
