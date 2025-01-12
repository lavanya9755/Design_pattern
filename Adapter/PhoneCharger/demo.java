package Adapter;

public class demo {
    public static void main(String[] args) {
        System.out.println("prog started");
        AppleCharger charger = new Chargerxyz();

        Iphone iphone13 = new Iphone(charger);
        iphone13.chargeIphone();

        System.out.println("if apple charger not available ");

        // AndroidCharger vivo = new ViVOCharger();
        AdapterCharger adapter = new AdapterCharger(new ViVOCharger());
        Iphone iphone13Android = new Iphone(adapter);
        iphone13Android.chargeIphone();
    }
}
