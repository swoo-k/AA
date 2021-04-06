package composite.arithmetic;

import java.util.ArrayList;
import java.util.Iterator;

public class MultipleComposite extends ArithmeticComponent{
    ArrayList comps = new ArrayList();
    ArithmeticComponent x, y;

    public MultipleComposite() {
    }

    @Override
    public void add(ArithmeticComponent arithmeticComponent) {
        comps.add(arithmeticComponent);
    }

    @Override
    public void remove(ArithmeticComponent arithmeticComponent) {
        comps.remove(arithmeticComponent);
    }

    @Override
    public int compute() {
        int ret = 1;
        Iterator iterator = comps.iterator();
        while (iterator.hasNext()) {
            ArithmeticComponent comp = (ArithmeticComponent) iterator.next();
            ret *= comp.compute();
        }

        return ret;
    }
}
