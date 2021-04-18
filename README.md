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



## Observer Pattern

> 객체 사이에 일 대 다의 의존 관계를 정의해 두어, 어떤 객체의 상태가 변할 때 그 객체에 의존성을 가진 다른 객체들이 그 변화를 통지 받고 자동으로 갱신될 수  있게 만든다.

### Use When

* 통신을 하면서 Loose coupling이 필요할 때
* Broadcasting 이 필요할 때
* 상태 변화를 하나 또는 여러 객체에 알릴 때

![observer pattern](./img/observer.png)



## Template Method Pattern

> 객체의 연산에는 알고리즘의 뼈대만을 정의하고 각 단계에서 수행할 구체적 처리는 서브클래스 쪽으로 미룹니다. 알고리즘의 구조 자체는 그대로 놔둔 채 알고리즘 각 단계 처리를 서브클래스에서 재정의 할 수 있게 합니다.
>
> (스텝 정의라고 생각)

## Use When

* 어떤 한 알고리즘을 이루는 부분 중 변하지 않는 부분을 한 번 정의해 놓고 다양해질 수 있는 부분은 서브클래스에서 정의 할 수 있도록 할 때

![template_pattern](./img/template.jpeg)

## Iterator

> 내부 표현부를 노출하지 않고 어떤 집합 객체에 속한 원소들을 순차적으로 접근할 수 있는 방법을 제공합니다.

### Use When

* 각 요소에 접근하되 내부 전체를 노출 하고 싶지 않을 때
* 집합 객체를 순회하는 다양한 방법을 지원하고 싶을 때

![Iterator Pattern](./img/iterator.jpeg)

### 디자인 원칙

* Single Responsibility (SRP)



## State Pattern

> 객체의 내부 상태에 따라 스스로 행동을 변경할 수 있게 허가하는 패턴으로, 이렇게 하면 객체는 마치 자신의 클래스를 바꾸는 것처럼 보인다.

### Use When

* Object의 행동이 상태에 영향을 받을 때
* 상태에 따라 복잡한 조건이 걸려 있을 때
* 상태에 따라 명확한 분리가 필요할 때

![state_pattern](./img/state.jpeg)

### 디자인 원칙 

* OCP

### 다른 패턴과의 유사성

* 전략 패턴과 유사하지만, 의도의 차이가 있다.
  * State패턴은 각각의 state행동을 encapsulate한다.
  * 전략패턴은 알고리즘을 encapsulate한다.
* 전략 패턴과 state패턴 모두 composition과 delegation을 활용한다.



## Mediator Pattern

> 한 집합에 속해있는 객체의 상호작용을 캡술화하는 객체를 정의합니다. 객체들이 직접 서로를 참조하지 않도록 하여 객체 사이의 소결합을 촉진시키며, 개발자가 객체의 상호작용을 독립적으로 다양화시킬 수 있게 만듭니다.
>
> like 관제실

### Use When

* Objects간의 메세지가 복잡할 때
* 너무 많은 관계가 존재하고, 그들사이의 복잡한 커뮤니케이션이 필요할 때

![mediator](./img/mediator.jpeg)

### 특징

* 각각의 object는 encapsulate하고, mediator를 통해서만 커뮤니케이션
* 각각의 클래스들은 loose coupling

장점

* easy to understand

단점

* hardly ever reusable



## 생성 패턴

> new를 사용하지 안하고 objects를 만들도록 하는 것. client의 코드를 수정하지 않고도 object를 생성할 수 있음. 
>
> 대표적인 예로 factory method, abstract factroy, sington, builder 등이 있음

### factory method

* 상속을 통해 object를 instantiated

### abstract factory

* factory object에 object생성을 delegation한다.



## Factory Method Pattern

> 객체를 생성하기 위해 인터페이스를 정의하지만, 어떤 클래스의 인스턴스를 생성할지에 대한 결정은 서브클래스가 내리도록한다. 

### Use When

* 어떤 클래스가 생성될 지 모를때
* Subclasses에서 어떤 object가 생성될지 특정될 때

![factory_method_pizza](./img/factory_method_example.jpeg)



![factory_method](./img/factory_method.jpeg)

### 디자인 원칙

* DIP 
  * Depend upon abstraction. Do not depend upon concrete classes
  * High-level components should not depend on low-level components