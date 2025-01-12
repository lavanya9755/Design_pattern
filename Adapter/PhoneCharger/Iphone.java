package Adapter;

public class Iphone {

    private AppleCharger appleCharger;
    public Iphone(AppleCharger appleCharger){
        this.appleCharger = appleCharger;
    }
    public void chargeIphone(){
        appleCharger.chargePhone();
    }
}
