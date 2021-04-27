package test.d20;

public class Main {
}

class Client1 {
    public void m1(ServiceInterface1 foo) {
        foo.service1();
        foo.service2();
    }
}

class Client2 {
   public void m2(ServiceInterface2 foo) {
       foo.service3();
   }
}

class Client3 {
    public void m3(ServiceInterface1 foo1, ServiceInterface2 foo2, int control) {
        if (control == 0)
            foo1.service1();
        else {
            foo1.service2();
            foo2.service3();
        }
    }
}
