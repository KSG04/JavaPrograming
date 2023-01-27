package d.람다식;

import d.람다식.인터페이스.LamdaInterface1;
import d.람다식.인터페이스.LamdaInterface2;
import d.람다식.인터페이스.LamdaInterface3;
import d.람다식.인터페이스.LamdaInterface4;

// 기존의 객체지향이 아닌 함수 지향으로 학습
public class main {
    public static void main(String[] args) {

        //매개변수와 실행문만으로 작성한다.(접근자, 반환형, return 키워드 생략)
        LamdaInterface1 li1 = (String t1,String t2, String t3) -> {
            System.out.println(t1 + " " + t2 + " " + t3 + " ");
        };
        li1.method("Hello","java","world");

        System.out.println();

        //매개변수가 1개 이거나 타입이 같을 떄, 타입을 생략 할 수 있다.
        LamdaInterface2 li2 =(s1) -> {
            System.out.println(s1);
        };

        li2.method("Hellow");


        //실행 문이 1개일 떄, '{}'를 생략할 수 있다.
        LamdaInterface2 li3 = (s1) -> System.out.println(s1);
        li3.method("java");

        //매개변수와 실행문이 1개일 때, '()' 와 '{}'를 생략할 수 있다.
        LamdaInterface2 li4 = s1 -> System.out.println(s1);
        li4.method("World");


        //매개변수가 없을때, '()'만 작성한다.
        LamdaInterface3 li5 = () -> System.out.println("no parameter");
        li5.method();

        //반환값이 있는 경우
        LamdaInterface4 li6 =(x,y) -> {
            int result = x + y;
            return result;
        };
        System.out.println("li6.method(10,20) : " + li6.method(10,20));

        li6 =(x,y) -> {
            int result = x - y ;
            return result;
        };
        System.out.println("li6.method(10,20) :" + li6.method(10,20));



    }
}
