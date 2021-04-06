package decorator.textview;

public class Horizontal extends UIDecorator{
    public Horizontal(TextView textView) {
        this.textView = textView;
    }

    @Override
    public String getDescription() {
        return this.textView.getDescription() + ", Horizontal Scroll";
    }
}
