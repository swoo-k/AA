package decorator.textview;

public class ThreeDimension extends UIDecorator{
    public ThreeDimension(TextView textView) {
        this.textView = textView;
    }

    @Override
    public String getDescription() {
        return this.textView.getDescription() + ", 3D Border";
    }
}
