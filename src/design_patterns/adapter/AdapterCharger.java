package design_patterns.adapter;

public class AdapterCharger implements  AppleCharger{
    private AndroidCharger charger;

    public AdapterCharger(AndroidCharger charger) {
        this.charger = charger;
    }

    @Override
    public void chargePhone() {
        charger.chargerAndroidPhone();
        System.out.println("Your phone is charging with adapter using android charger");
    }
}
