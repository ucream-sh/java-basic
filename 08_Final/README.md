## 8장 정리

### final
`final` 키워드는 이름 그대로 끝! 이라는 뜻이다.
변수에 `final` 키워드가 붙으면 더는 값을 변경할 수 없다.
참고로 `final` 은 `class` , `method` 를 포함한 여러 곳에 붙을 수 있다.
`final` 은 매우 유용한 제약이다. 만약 특정 변수의 값을 할당한 이후에 변경하지 않아야 한다면 `final` 을 사용하자.

### 지역 변수
- `final` 을 지역 변수에 설정할 경우 최초 한번만 할당할 수 있다. 이후에 변수의 값을 변경하려면 컴파일 오류가 발생한다.
- `final` 을 지역 변수 선언시 바로 초기화 한 경우 이미 값이 할당되었기 때문에 값을 할당할 수 없다.
- 매개변수에 `final` 이 붙으면 메서드 내부에서 매개변수의 값을 변경할 수 없다. 따라서 메서드 호출 시점에 사용된 값이 끝까지 사용된다

### 필드(멤버 변수)
- `final` 을 필드에 사용할 경우 해당 필드는 생성자를 통해서 한번만 초기화 될 수 있다.
- `final` 필드를 필드에서 초기화하면 이미 값이 설정되었기 때문에 생성자를 통해서도 초기화 할 수 없다. 
- `static` 변수에도 `final` 을 선언할 수 있다. (상수)

- final 필드를 필드에서 초기화 하는 경우, 모든 인스턴스가 힙 영역에 각각 같은 값을 가지고 생성된다.
- 모든 인스턴스가 같은 값을 사용하기 때문에 결과적으로 메모리를 낭비하게 된다.(물론 JVM에 따라서 내부 최적화를 시도할 수 있다) 또 메모리 낭비를 떠나서 같은 값이 계속 생성되는 것은 개발자가 보기에 명확한 중복이다. 
- 이럴 때 사용하면 좋은 것이 바로 static 영역이다. 
  
**static final**
- `static` 영역은 단 하나만 존재하는 영역이다. `static`으로 선언한 변수는 JVM 상에서 하나만 존재하므로 앞서 설명한 중복과 메모리 비효율 문제를 모두 해결할 수 있다.
- 이런 이유로 필드에 `final` + 필드 초기화를 사용하는 경우 `static` 을 붙여서 사용하는 것이 효과적이다

### 상수 (Constant)
- 상수: 변하지 않고, 항상 일정한 값을 갖는 수
  - 자바에서는 보통 단 하나만 존재하는 변하지 않는 고정된 값    
  - 이런 이유로 상수는 `static final` 키워드를 사용한다.

**자바 상수 특징**
- `static final` 키워드를 사용한다.
- 대문자를 사용하고 구분은 `_` (언더스코어)로 한다. (관례)
  - 일반적인 변수와 상수를 구분하기 위해 이렇게 한다.
- 필드를 직접 접근해서 사용한다.
  - 상수는 기능이 아니라 고정된 값 자체를 사용하는 것이 목적이다.
  - 상수는 값을 변경할 수 없다. 따라서 필드에 직접 접근해도 데이터가 변하는 문제가 발생하지 않는다.
- 애플리케이션 안에는 다양한 상수가 존재할 수 있다. 수학, 시간 등등 실생활에서 사용하는 상수부터, 애플리케이션의 다양한 설정을 위한 상수들도 있다.
- 보통 이런 상수들은 애플리케이션 전반에서 사용되기 때문에 `public` 를 자주 사용한다. 물론 특정 위치에서만 사용된다면 다른 접근 제어자를 사용하면 된다.
- 상수는 중앙에서 값을 하나로 관리할 수 있다는 장점도 있다.
- 상수는 런타임에 변경할 수 없다. 상수를 변경하려면 프로그램을 종료하고, 코드를 변경한 다음에 프로그램을 다시 실행해야 한다.


### final 변수와 참조
- 변수는 크게 기본형 변수와 참조형 변수가 있다.
- 기본형 변수는 10 , 20 같은 값을 보관하고, 참조형 변수는 객체의 참조값을 보관한다.
  - `final` 을 기본형 변수에 사용하면 값을 변경할 수 없다.
  - `final` 을 참조형 변수에 사용하면 참조값을 변경할 수 없다.
    - 참조 대상을 자체를 다른 대상으로 변경하지 못하는 것이지, 참조하는 대상의 값은 변경할 수 있다.
  