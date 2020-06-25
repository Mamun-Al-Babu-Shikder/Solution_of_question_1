package service;

import vehicle.Vehicle;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by A.A.MAMUN on 6/25/2020.
 */
public class VehicleManager {

    private List<Vehicle> vehicleList;

    public VehicleManager(){
        this.vehicleList = new ArrayList<>();
    }

    /**
     * method for add vehicle
     */
    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }

    /**
     * method for remove vehicle from list.
     */
    public Vehicle removeVehicle(int position){
        Vehicle vehicle = null;
        if(position>0 && position<=vehicleList.size()){
            vehicle = vehicleList.get(position-1);
            vehicleList.remove(position-1);
        }
        return vehicle;
    }

    /**
     * show the all current vehicles.
     */
    public void showVehicles(){

        System.out.println("# Vehicle List :");
        if(vehicleList.size()==0){
            System.out.println("Vehicle list is empty.");
            return;
        }

        for (int i = 0; i <vehicleList.size(); i++){
            System.out.println((i+1)+". "+vehicleList.get(i));
        }
    }

    public boolean isAvailable(){
        return vehicleList.size() > 0;
    }
}
