package c.추상클래스;
//인터페이스와 비슷한 형태로 구체화되지 않은 멤버를 이용하여 클래스를 만드는 방법

//abstract
//1. 클래스의 공통된 부분을 뽑아서 별도의 클래스(추상클래스)로 만들어 놓고, 이것을 상속해서 사용한다
//2. 멤버변수를 가진다
//3. abstract 클래스를 상속하기 위해서는 extends를 이용한다
//4. abstract 매서드를 가지며 상속한 클래스에서 반드시 구현해야 한다.

public class main {
    public static void main(String[] args) {
        AbstractClass ex = new Classex(10,"Java");

        ex.fun1();
        ex.fun2();
    }
}
