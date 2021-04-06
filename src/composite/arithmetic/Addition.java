package composite.arithmetic;

public class Addition extends ArithmeticComponent {
    private int x, y;

    public Addition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compute() {
        return this.x + this.y;
    }
}

