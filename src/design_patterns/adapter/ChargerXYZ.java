package design_patterns.adapter;

public class ChargerXYZ implements AppleCharger{
    @Override
    public void chargeIPhone() {
        System.out.println("Your IPhone is charging");
    }
}
