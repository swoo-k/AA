package composite.arithmetic;

public class Multiple extends ArithmeticComponent {
    private int x, y;

    public Multiple(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compute() {
        return this.x * this.y;
    }
}
