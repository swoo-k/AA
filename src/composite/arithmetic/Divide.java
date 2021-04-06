package composite.arithmetic;

public class Divide extends ArithmeticComponent {
    private int x, y;

    public Divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException();
        }
        this.x = x;
        this.y = y;
    }

    @Override
    public int compute() {
        return this.x / this.y;
    }
}
