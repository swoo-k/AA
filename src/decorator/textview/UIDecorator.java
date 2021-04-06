package decorator.textview;

public abstract class UIDecorator extends TextView {
    protected TextView textView;
    public abstract String getDescription();
}
