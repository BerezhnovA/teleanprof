package lessonone;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Alex Alexeev", 35);
        Employee employeeTwo = new Employee("Oleg Olegov", 20);

        employeeOne.setPosition("CEO");
        String position = employeeOne.getPosition();
        employeeTwo.setPosition("Clerk");

        String positionOne = employeeOne.getPosition();
        String positionTwo = employeeTwo.getPosition();
        System.out.println("Position one " + positionOne);
        System.out.println("Position two " + positionTwo);

        employeeTwo.printEmployeeInfo();


    }
}
