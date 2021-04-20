package builder;

public class AerospaceEngineer {
    private AirplaneBuilder airplaneBuilder;

    public void setAirplaneBuilder(AirplaneBuilder airplaneBuilder) {
        this.airplaneBuilder = airplaneBuilder;
    }

    public Airplane getAirplane() {
        return airplaneBuilder.getAirplane();
    }

    public void constructAirplane() {
        airplaneBuilder.createNewAirplane();
        airplaneBuilder.buildWings();
        airplaneBuilder.buildPowerplant();
        airplaneBuilder.buildAvionics();
        airplaneBuilder.buildSeats();
    }
}
