package design_patterns.abstract_factory;

public class ManagerFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new Manager();
    }
}
