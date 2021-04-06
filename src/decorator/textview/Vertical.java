package decorator.textview;

public class Vertical extends UIDecorator{
    public Vertical(TextView textView) {
        this.textView = textView;
    }

    @Override
    public String getDescription() {
        return this.textView.getDescription() + ", Vertical Scroll";
    }
}
