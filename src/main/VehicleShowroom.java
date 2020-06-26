package main;

import service.VehicleManager;
import vehicle.*;
import java.util.Scanner;

/**
 * Created by A.A.MAMUN on 6/25/2020.
 */
public class VehicleShowroom {

    static int visitor = 30;

    public static void main(String[] args) {

        VehicleManager vehicleManager = new VehicleManager();
        OptionMenu optionMenu = new OptionMenu();
        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.print("1. Add Vehicle\n2. Remove Vehicle\n3. Show Vehicles\n" +
                    "4. Show vehicles with current expected visitor\n5. Exit\n");
            System.out.print("Please enter option : ");

            int option = scanner.nextInt();

            if(option==1){

                System.out.print("1. Normal Vehicle\n2. Sports Vehicle\n3. Heavy Vehicle\nPlease select an option : ");
                int option2 = scanner.nextInt();
                Vehicle vehicle;
                if(option2 > 0 && option2 < 4){

                    System.out.print("Enter model number : ");
                    String modelNumber = scanner.next();
                    System.out.print("Enter engine power : ");
                    String enginePower = scanner.next();
                    System.out.print("Enter tire size : ");
                    String tireSize = scanner.next();

                    if(option2 == 1){

                        EngineType[] engineTypes = EngineType.values();
                        EngineType engineType;
                        int type;
                        while (true) {
                            for(int i=0; i<engineTypes.length; i++)
                                System.out.println(i+1+". "+engineTypes[i]);
                            System.out.print("Please choose engine type : ");
                            type = scanner.nextInt();
                            if(type < 1 || type > engineTypes.length){
                                System.out.println("Invalid option. Please try again.");
                            }else {
                                engineType = engineTypes[type-1];
                                break;
                            }
                        }
                        vehicle = new NormalVehicle(modelNumber, engineType, enginePower, tireSize);

                    }else if(option2 == 2){
                        System.out.print("Turbo : ");
                        String turbo = scanner.next();
                        vehicle = new SportsVehicle(modelNumber, enginePower, tireSize, turbo);
                        visitor = visitor + 20;
                    }else {
                        System.out.print("Enter weight : ");
                        String weight = scanner.next();
                        vehicle = new HeavyVehicle(modelNumber, enginePower, tireSize, weight);
                    }
                    vehicleManager.addVehicle(vehicle);
                    System.out.println("Vehicle successfully added!");

                }else {
                    System.out.println("Invalid option.");
                    return;
                }

            }else if(option==2){

                if(vehicleManager.isAvailable()){

                    vehicleManager.showVehicles();
                    System.out.print("Enter the SL No. to remove vehicle : ");
                    int position = scanner.nextInt();
                    Vehicle vehicle = vehicleManager.removeVehicle(position);
                    if(vehicle==null){
                        System.out.println("Invalid SL No. please try later with valid one");
                    }else{
                        if(vehicle instanceof SportsVehicle){
                            visitor = visitor - 20;
                        }
                        System.out.println("Successfully removed!");
                    }
                }else {
                    System.out.println("Vehicle list is empty. Please add vehicle at first.");
                }

            }else if(option==3){
                vehicleManager.showVehicles();
            }else if(option==4){
                vehicleManager.showVehicles();
                System.out.println("Current expected visitor : " + visitor);
            }else if(option==5){
                break;
            }else {
                System.out.println("Invalid option. Please try again.");
            }
            System.out.println("-----------------------------------------");
        }
    }

}
