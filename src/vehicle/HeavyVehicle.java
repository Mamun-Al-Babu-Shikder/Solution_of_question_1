package vehicle;

/**
 * Created by A.A.MAMUN on 6/25/2020.
 */
/**
 * The 'HeavyVehicle' is one of the  child class of 'Vehicle'
 * with extra attribute 'weight'
 */
public class HeavyVehicle extends Vehicle{

    private String weight;

    public HeavyVehicle(String modelNumber, String enginePower, String tireSize, String weight) {
        super(modelNumber, EngineType.DIESEL, enginePower, tireSize);
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyVehicle{" + super.toString()+
                ", weight='" + weight + '\'' +
                '}';
    }
}