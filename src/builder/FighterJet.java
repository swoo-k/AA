package builder;

public class FighterJet extends AirplaneBuilder{
    public FighterJet(String customer) {
        super.customer = customer;
        super.type = "F-35 Lightning II";
    }

    @Override
    public void buildWings() {
       airplane.setWingspan(35.0f);
    }

    @Override
    public void buildPowerplant() {
        airplane.setPowerplant("dual thrust vectoring");
    }

    @Override
    public void buildAvionics() {
        airplane.setAvionics("military");
    }

    @Override
    public void buildSeats() {
        airplane.setNumberSeats(1, 0);
    }
}
