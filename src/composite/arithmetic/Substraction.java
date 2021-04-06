package composite.arithmetic;

public class Substraction extends ArithmeticComponent{
    private int x, y;

    public Substraction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compute() {
        return this.x - this.y;
    }
}
