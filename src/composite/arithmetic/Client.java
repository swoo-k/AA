package composite.arithmetic;

public class Client {
    ArithmeticComponent all;

    public Client(ArithmeticComponent all) {
        this.all = all;
    }

    public int compute() {
        return all.compute();
    }
}
