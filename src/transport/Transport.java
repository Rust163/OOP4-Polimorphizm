package transport;

public abstract class Transport {
    protected String brand;
    protected String model;
    protected double engineVol;

    public Transport(String brand, String model, double engineVol) {
        this.brand = brand;
        this.model = model;
        this.engineVol = engineVol;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVol() {
        return engineVol;
    }

    public void setEngineVol(double engineVol) {
        this.engineVol = engineVol;
    }

    public void startMoving() {

    }

    public void stopMoving() {

    }


}
