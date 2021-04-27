//package test.q17;
//
//public class Student {
//    public static void main(String[] args) {
//        A objectA = new A();
//        int a = 5;
//        int b = 3;
//        objectA.systemOP(a, b);
//    }
//}
//
//class A {
//    B objectB = new B();
//    C objectC = new C();
//
//    public int systemOP(int a, int b) {
//        int aa, bb;
//        if (a > b) {
//            aa = objectB.a(a);
//        } else if (b > a) {
//            bb = objectC.b(b);
//        } else {
//            aa = objectB.a(a);
//            bb = objectC.b(b);
//        }
//
//        return aa - bb;
//    }
//}
//
//class B {
//    C objectC = new C();
//
//    public int a(int a) {
//        objectC.b(a);
//        return a * a;
//    }
//
//}
//
//class C {
//    public int b(int a) {
//        return a * a;
//    }
//}
