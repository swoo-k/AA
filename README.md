디자인 패턴 목록

1. Strategy Pattern
2. Observer Pattern
3. Template Method pattern
4. Iterator Pattern
5. State Pattern
6. Mediator Pattern
7. Factory Method Pattern
8. Abstract Factory Method Pattern
9. Builder Pattern
10. Singleton Pattern
11. Decorator Pattern
12. Adapter Pattern
13. Composite Pattern
14. Bridge Pattern
15. MVC Pattern



## Strategy Pattern

> 동일 계열의 알고리즘군을 정하고, 각 알고리즘을 캡슐화하며, 이들을 상호교환이 가능하도록 만듭니다. 알고리즘을 사용하는 클라이언트와 상관없이 독립적으로 알고리즘을 다양하게 변경할 수 있게 합니다. 

### Use when

- 연관된 클래스의 다른점이 오직 행동일 때
- 다양한 버전 또는 변형의 알고리즘이 요구 될 때
- 클래스의 행동(behavior)가 runtime에 정의 될 때
- 조건문이 복잡하고 유지가 어려울 때 

### 디자인 원칙

* composition

* delegation

  

![strategy pattern](./img/strategy.jpeg)

