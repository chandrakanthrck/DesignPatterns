package design_patterns.abstract_factory;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        return 60000;
    }

    @Override
    public String name() {
        System.out.println("I am Web Developer");
        return "WEB DEVELOPER";
    }
}
