package airconditionerAbstractInter;

public class Room {
    private int number;
    private double volume;
    private double baseTemperature;
    private double goalTemperature;
    private AirConditioner airConditioner;

    public Room(int number, double volume, double baseTemperature, double goalTemperature, AirConditioner airConditioner) {
        this.number = number;
        this.volume = volume;
        this.baseTemperature = baseTemperature;
        this.goalTemperature = goalTemperature;
        this.airConditioner = airConditioner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getBaseTemperature() {
        return baseTemperature;
    }

    public void setBaseTemperature(double baseTemperature) {
        this.baseTemperature = baseTemperature;
    }

    public double getGoalTemperature() {
        return goalTemperature;
    }

    public void setGoalTemperature(double goalTemperature) {
        this.goalTemperature = goalTemperature;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public void cool(){
        if(baseTemperature>goalTemperature){
            baseTemperature = airConditioner.lowerTemperature(baseTemperature,volume);
        }
    }

    @Override
    public String toString() {
        return "Pokój{" +
                "Numer: " + number +
                ", Objętość :" + volume +
                ", Obecna temperatura: " + String.format("%.2f",baseTemperature) +
                ", Docelowa temperatura " + goalTemperature +
                ", Używany klimatyzator: " + airConditioner +
                '}';
    }
}

