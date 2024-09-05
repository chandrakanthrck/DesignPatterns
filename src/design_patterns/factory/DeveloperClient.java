package design_patterns.factory;

public class DeveloperClient {
    public static void main(String[] args){
        //now this is tightly coupled
        Employee employee1 = new AndroidDeveloper();
        System.out.println(employee1.salary());
        //using factory pattern
        Employee employee2 = EmployeeFactory.getEmployee("WEB DEVELOPER");
        System.out.println(employee2.salary());
    }
}