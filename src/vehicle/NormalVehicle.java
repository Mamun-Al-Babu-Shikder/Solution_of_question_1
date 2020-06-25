package vehicle;

/**
 * Created by A.A.MAMUN on 6/25/2020.
 */
/**
 * The 'NormalVehicle' is one of the  child class of 'Vehicle'
 */
public class NormalVehicle extends Vehicle{

    public NormalVehicle(String modelNumber, EngineType engineType, String enginePower, String tireSize) {
        super(modelNumber, engineType, enginePower, tireSize);
    }

    public void setEngineType(EngineType engineType){
        super.engineType = engineType;
    }

    @Override
    public String toString() {
        return "NormalVehicle{" + super.toString() + "}";
    }

}