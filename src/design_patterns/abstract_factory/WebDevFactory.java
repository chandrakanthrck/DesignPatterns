package design_patterns.abstract_factory;

public class WebDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
