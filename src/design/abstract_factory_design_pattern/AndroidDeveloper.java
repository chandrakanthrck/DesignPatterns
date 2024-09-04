package design.abstract_factory_design_pattern;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String name(){
        System.out.println("I am Android Developer");
        return  "ANDROID DEVELOPER";
    }

}
