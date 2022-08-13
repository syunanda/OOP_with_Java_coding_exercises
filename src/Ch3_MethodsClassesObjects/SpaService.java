package Ch3_MethodsClassesObjects;

public class SpaService {

    private String serviceDescription = "XXX";
    private double price = 0;

    public void setServiceDescription(String service){
        serviceDescription = service;
    }
    public String getServiceDescription() {
        return serviceDescription;
    }
    public void setPrice (double servicePrice) {
        price = servicePrice;
    }
    public double getPrice () {
        return price;
    }


}
