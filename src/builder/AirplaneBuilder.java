package builder;

public abstract class AirplaneBuilder {
    protected Airplane airplane;
    protected String customer;
    protected String type;

    public Airplane getAirplane() {
        return airplane;
    }

    public void createNewAirplane() {
        airplane = new Airplane(customer, type);
    }

    public abstract void buildWings();
    public abstract void buildPowerplant();
    public abstract void buildAvionics();
    public abstract void buildSeats();
}
