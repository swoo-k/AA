package composite.arithmetic;

import java.util.ArrayList;
import java.util.Iterator;

public class DivideComposite extends ArithmeticComponent{
    ArrayList comps = new ArrayList();

    public DivideComposite() {
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
        boolean flag = false;
        int ret = 0;
        Iterator iterator = comps.iterator();
        while(iterator.hasNext()) {
            ArithmeticComponent arithmeticComponent = (ArithmeticComponent) iterator.next();
            if (!flag) {
                ret = arithmeticComponent.compute();
                flag = true;
                continue;
            }

            ret /= arithmeticComponent.compute();
        }

        return ret;
    }
}
