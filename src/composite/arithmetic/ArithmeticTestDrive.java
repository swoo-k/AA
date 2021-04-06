package composite.arithmetic;

public class ArithmeticTestDrive {
    public static void main(String[] args) {
        //가. 8
        ArithmeticComponent a = new Single(8);
        ArithmeticComponent all = new ArithmeticComposite();
        all.add(a);

        Client c = new Client(all);
        int result = c.compute();
        System.out.println("가." + result);

        ArithmeticComponent b = new Addition(3, 4);
        all = new ArithmeticComposite();
        all.add(b);

        c = new Client(all);
        result = c.compute();
        System.out.println("나." + result);

        ArithmeticComponent c1 = new MultipleComposite();
        c1.add(new Substraction(3,2));
        c1.add(new Addition(5, 4));

        ArithmeticComponent c2 = new DivideComposite();
        c2.add(c1);
        c2.add(new Single(2));

        c = new Client(c2);
        result = c.compute();
        System.out.println("다." + result);


    }
}
