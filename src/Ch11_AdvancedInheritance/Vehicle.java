package Ch11_AdvancedInheritance;

public abstract class Vehicle {
    private String powerSource;
    private int wheels;
    protected double price;

    public Vehicle(String powerSource, int numOfWheels){
        setPowerSource(powerSource);
        setWheels(numOfWheels);
        setPrice();
    }
    public void setPowerSource(String powerSource){
        this.powerSource = powerSource;
    }
    public void setWheels(int numOfWheels){
        this.wheels = numOfWheels;
    }
    public abstract void setPrice();

    public String getPowerSource(){
        return this.powerSource;
    }
    public int getWheels(){
        return wheels;
    }
    public double getPrice(){
        return price;
    }
}
