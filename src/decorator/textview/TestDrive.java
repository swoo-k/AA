package decorator.textview;

public class TestDrive {
    public static void main(String[] args) {
        TextView view = new PureView();
        view = new ThreeDimension(view);
        view = new Horizontal(view);
        view = new Vertical(view);
        
        System.out.println(view.getDescription());
    }
}
