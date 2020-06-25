package vehicle;

/**
 * Created by A.A.MAMUN on 6/25/2020.
 */
/**
 * The 'Vehicle' class is the root or parent of other
 * vehicle types classes like 'NormalVehicle', 'SportsVehicle',
 * 'HeavyVehicle' with common property.
 */
public class Vehicle {

    protected String modelNumber;
    protected EngineType engineType;
    protected String enginePower;
    protected String tireSize;

    /**
     * modelNumber, engineType, enginePower, tireSize
     * initialization inside Constructor.
     */

    public Vehicle(String modelNumber, EngineType engineType, String enginePower, String tireSize) {
        this.modelNumber = modelNumber;
        this.engineType = engineType;
        this.enginePower = enginePower;
        this.tireSize = tireSize;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public String getTireSize() {
        return tireSize;
    }

    public void setTireSize(String tireSize) {
        this.tireSize = tireSize;
    }

    /**
     * toString() method to create a string
     * according to value of common attribute.
     */
    @Override
    public String toString() {
        return "modelNumber='" + modelNumber + '\'' +
                ", engineType='" + engineType + '\'' +
                ", enginePower='" + enginePower + '\'' +
                ", tireSize='" + tireSize;
    }
}
