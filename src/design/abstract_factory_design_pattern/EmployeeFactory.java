package design.abstract_factory_design_pattern;

public class EmployeeFactory {
    // get employee
    public static Employee getEmployee(EmployeeAbstractFactory factory){
        return factory.createEmployee();
    }
}
