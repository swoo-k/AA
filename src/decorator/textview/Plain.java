package decorator.textview;

public class Plain extends UIDecorator{
    public Plain(TextView textView) {
        this.textView = textView;
    }

    @Override
    public String getDescription() {
        return this.textView.getDescription() + ", Plain Border";
    }
}
