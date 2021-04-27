package test.d18;

public class Stimpack extends ArmoryDecorator{
    public Stimpack(Unit unit) {
        this.unit = unit;
    }

    @Override
    public String getDescription() {
        return "Stimpacked_" + unit.getDescription();
    }
}
