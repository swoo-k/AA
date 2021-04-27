package bridge;

public class Circle extends Shape{
    double _x, _y, _r;

    public Circle(Drawing dp, double _x, double _y, double _r) {
        super(dp);
        this._x = _x;
        this._y = _y;
        this._r = _r;
    }

    @Override
    public void draw() {
       drawCircle(_x, _y, _r);
    }
}
