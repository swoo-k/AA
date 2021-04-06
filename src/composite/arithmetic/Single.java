package composite.arithmetic;

public class Single extends ArithmeticComponent {
    private int x;

    public Single(int x) {
        this.x = x;
    }

    @Override
    public int compute() {
        return this.x;
    }
}
