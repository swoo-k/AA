package adapter.coffee;

public class CoffeeAdapter implements ICoffeeMaker{
    OldCoffeeMaker oldCoffeeMaker;
    public CoffeeAdapter() {
        oldCoffeeMaker = new OldCoffeeMaker();
    }

    @Override
    public void selectAService() {
        oldCoffeeMaker.selectService1();
    }

    @Override
    public void selectBService() {
        oldCoffeeMaker.selectService2();
    }
}
