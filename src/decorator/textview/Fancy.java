package decorator.textview;

public class Fancy extends UIDecorator{
    public Fancy(TextView textView) {
        this.textView = textView;
    }

    @Override
    public String getDescription() {
        return this.textView.getDescription() + ", Fancy Border";
    }
}
