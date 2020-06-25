package vehicle;

/**
 * Created by A.A.MAMUN on 6/25/2020.
 */
/**
 * The 'SportsVehicle' is one of the  child class of 'Vehicle'
 * with extra attribute 'turbo'
 */
public class SportsVehicle extends Vehicle{

    private String turbo;

    public SportsVehicle(String modelNumber, String enginePower, String tireSize, String turbo) {
        super(modelNumber, EngineType.OIL, enginePower, tireSize);
        this.turbo = turbo;
    }

    public String getTurbo() {
        return turbo;
    }

    public void setTurbo(String turbo) {
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return "SportsVehicle{" + super.toString() +
                ", turbo='" + turbo + '\'' +
                '}';
    }
}