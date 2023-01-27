package b.인터페이스;

// 사용하는 이유 : 객체가 다양한 자료형 타입을 가질 수 있기 떄문

// interface 특징
// 1. 인터페이스의 모든 필드는 public static final 필드이다.
// 2. 모든 메서드는 public abstract 이며 이 부분은 공통으로 적용되기 때문에 생략 가능하다
//
public class main {

    public static void main(String[] args) {

        InterfaceA ia = new InterfaceClass();
        InterfaceB ib = new InterfaceClass();

        ia.funA();
        ib.funB();
    }
}
