package composite.arithmetic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArithmeticComposite extends ArithmeticComponent {
    ArrayList arithmeticComponents;

    public ArithmeticComposite() {
        this.arithmeticComponents = new ArrayList();
    }

    @Override
    public void add(ArithmeticComponent arithmeticComponent) {
        arithmeticComponents.add(arithmeticComponent);
    }

    @Override
    public void remove(ArithmeticComponent arithmeticComponent) {
        arithmeticComponents.remove(arithmeticComponent);
    }

    @Override
    public int compute() {
        int ret = 0;
        Iterator iterator = arithmeticComponents.iterator();
        while(iterator.hasNext()) {
            ArithmeticComponent arithmeticComponent = (ArithmeticComponent) iterator.next();
            ret += arithmeticComponent.compute();
        }
        return ret;
    }
}
