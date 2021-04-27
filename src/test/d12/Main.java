package test.d12;

public class Main {
    public static void main(String[] args) {
        A1 a = new C1();
        Int1 e = new C3();
        Int2 i = new C1();
    }
}

abstract class A1 implements Int2{

}

interface Int1 {

}
interface Int2 {

}

class C1 extends A1 implements Int1{

}

class C3 extends C1 {

}
