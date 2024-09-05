package design_patterns.adapter;

public class ChargerXYZ implements AppleCharger{
    @Override
    public void chargePhone() {
        System.out.println("Your IPhone is charging");
    }
}
