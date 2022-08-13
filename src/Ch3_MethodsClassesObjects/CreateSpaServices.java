package Ch3_MethodsClassesObjects;

import java.util.Scanner;

public class CreateSpaServices {
    public static void main(String[] args) {

        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        firstService = getData(firstService);
        secondService = getData(secondService);

        System.out.println("First service details: " +
                "\n" + firstService.getServiceDescription() +
                " " + firstService.getPrice());

        System.out.println("Second service details: " +
                "\n" + secondService.getServiceDescription() +
                " " + secondService.getPrice());
    }
    public static SpaService getData(SpaService spaService) {
        String service;
        double price;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter service >> ");
        service = keyboard.nextLine();
        System.out.println("Enter price >> ");
        price = keyboard.nextDouble();
        keyboard.nextLine();
        spaService.setServiceDescription(service);
        spaService.setPrice(price);
        return spaService;
    }
}
