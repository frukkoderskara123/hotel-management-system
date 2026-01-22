class smartDevice {
    protected String modelname;
    public smartDevice(String modelname) {
        this.modelname=modelname;
    }
    public String toString() {
        return "Device Model: [ "+this.modelname+" ]";
    }
    public void performaction() {
        System.out.println("Device is initializing...");
    }


}
class SmartLıght extends smartDevice {
    private int brightness;
    public SmartLıght(String modelname,int brightness) {
        super(modelname);
        this.brightness=brightness;
    }
    @Override
    public String toString() {
        return "Device Model: [ "+this.modelname+" ]"+"Brightness:"+"["+this.brightness+"]";
    }
    @Override
    public void performaction() {
        System.out.printf("[%s] is shining at brightness % %d.",this.modelname,this.brightness);
    }
    public boolean equals(Object o) {
        if (o instanceof SmartLıght) {
            SmartLıght other=(SmartLıght) o;// casting
            return this.modelname.equals(other.modelname) && this.brightness == other.brightness;
        }
        return false;
    }

}
class smartthermostat extends smartDevice{
    private double tempature;
    public smartthermostat(String modelname,double tempature) {
        super(modelname);
        this.tempature=tempature;
    }
    @Override
    public String toString() {
        return "Device Model: [ "+this.modelname+" ]"+"Tempature:"+"["+this.tempature+"]";
    }
    @Override
    public void performaction() {
        System.out.printf("[%s] is setting temperature to [%f]°C.",this.modelname,this.tempature);
    }

}
public class NEWBEGİNNİG {
    public static void main(String args) {
        SmartLıght şato=new SmartLıght("Lamba",70);
        smartDevice[] kale=new smartDevice[2];

        şato.toString();
    }
}