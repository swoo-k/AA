package builder;

public class Glider extends AirplaneBuilder {
    public Glider(String customer) {
        super.customer = customer;
        super.type = "Glider v9.0";
    }

    @Override
    public void buildWings() {
        airplane.setWingspan(57.1f);
    }

    @Override
    public void buildPowerplant() {
    }

    @Override
    public void buildAvionics() {
    }

    @Override
    public void buildSeats() {
        airplane.setNumberSeats(1, 0);
    }
}
