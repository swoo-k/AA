package test.d19;

public class Main {
}

abstract class Calc {
    //음수가 나올 수 없는 상황이라 가정해 에러를 다음과 같이 음수값으로 지정
    final int ERR_RETURN = -999;
    final void calculate(int a, int f, int c) {
        int result = compute(a, f, c);
        if(result == ERR_RETURN)
            printExceptionResult();
        printResult(result);
    }

    protected abstract int compute(int a, int f, int c);

    private void printExceptionResult() {
        System.out.println("Cannot calculate!");
    }

    private void printResult(int result) {
        System.out.println("Result = " + result);
    }
}


class ArithmeticCalc extends Calc {
    int result;

    protected int compute(int a, int f, int c) {
        result = 0;
        if (c <= 0) return ERR_RETURN;
        for (int n = 1; n <= c; n++) {
            result += (a + (n - 1) * f);
        }
        result = result / c;

        return result;
    }

}

class GeometricCalc extends Calc {
    int result;

    protected int compute(int a, int f, int c) {
        result = 1;
        if (c <= 1) return ERR_RETURN;
        for (int n = 1; n <= c; n++) {
            result += (a + (int) Math.pow(f, n - 1));
        }
        result = result / (c - 1);
        return result;
    }
}
