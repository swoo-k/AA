package test.d18;

public class Armored extends ArmoryDecorator{
    public Armored(Unit unit) {
        this.unit = unit;
    }

    @Override
    public String getDescription() {
        return "Armoreded_" + unit.getDescription();
    }
}
