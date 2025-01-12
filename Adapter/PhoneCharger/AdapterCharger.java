package Adapter;

public class AdapterCharger implements AppleCharger{
    private AndroidCharger androidCharger;

    public AdapterCharger(AndroidCharger androidCharger){
        this.androidCharger = androidCharger;
    }
    @Override
    public void chargePhone() {
    
        androidCharger.chargeAndroidPhone();
        System.out.println("your phone charging using adappter");
        
    }
    
}
