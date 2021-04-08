package factory.method;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Dough";
        sauce = "Olive Sauce";
        toppings.add("Veggie");
    }
}
