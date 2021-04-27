package bridge;

public class Rectangle extends Shape{
    double _x1, _y1, _x2, _y2;

    public Rectangle(Drawing dp, double _x1, double _y1, double _x2, double _y2) {
        super(dp);
        this._x1 = _x1;
        this._y1 = _y1;
        this._x2 = _x2;
        this._y2 = _y2;
    }

    @Override
    public void draw() {
        drawLine(_x1, _y1, _x2, _y1);
        drawLine(_x2, _y1, _x2, _y2);
        drawLine(_x2, _y2, _x1, _y2);
        drawLine(_x1, _y2, _x1, _y1);
    }
}
