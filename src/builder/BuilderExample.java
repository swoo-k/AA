package builder;

public class BuilderExample {
    public static void main(String[] args) {
        //init the director
        AerospaceEngineer aero = new AerospaceEngineer();

        //init each builders
        AirplaneBuilder crop = new CropDuster("Farmer Joe");
        AirplaneBuilder fighter = new FighterJet("The Navy");
        AirplaneBuilder glider = new Glider("Tim Rice");

        //build a CropDuster
        aero.setAirplaneBuilder(crop);
        aero.constructAirplane();
        Airplane completedCropDuster = aero.getAirplane();
        System.out.println(completedCropDuster.getType() +
                " is completed and ready for delivery to " +
                completedCropDuster.getCustomer());
    }
}
