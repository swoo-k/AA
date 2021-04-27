package test.d17;

public class Main {
}


abstract class Context {
    Strategy algo;

    public void setStrategy(Strategy strategy) {
        algo = strategy;
    };
    public void runStrategy() {
        algo.execute();
    }
}

abstract class Strategy {
    public abstract void execute();
}