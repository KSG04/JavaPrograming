package d.람다식.실습;

// 람다 함수란 ?
// 프로그래밍 언어에서 사용되는 개념으로 익명 함수를 지칭하는 용어
// 람다의 근간은 수학과 기초 컴퓨터과학 분야에서의 람다 대수이다.
// 람다 대수는 간단히 말하자면 수학에서 함수를 보다 단순하게 표현하는 방법

// 특징
// 1. 람다 대수는 이름을 가질 필요가 없다. - 익명 함수 (Anonymous)
// 2. 두개 이상의 입력이 있는 함수는 최종적으로 1개의 입력만 받는 람다 대수로 단순화 가능 - 커릭 (curring)

// 장점
// 1. 코드의 간결성 - 람다를 사용하면 불필요한 반복문의 삭제가 가능하며 복잡한 식을 단순하게 표현 가능
// 2. 지연연산 수행 - 람다는 지연연상을 수행 함으로써 불필요한 연산을 최소화 가능
// 3. 병렬처리 가능 - 멀티쓰레드를 활용하여 병렬처리를 사용 할 수 있음

// 단점
// 1. 람다식의 호출이 까다로움
// 2. 람다 stream 사용 시 단순 for문 혹은 while문 사용시 성능이 떨어짐
// 3. 불필요하게 너무 사용하게 되면 오히려 가독성이 떨어질 수 있음.

// stream 이란?
// 다양한 데이터를 표준화된 방법으로 다루기 위한 라이브러리
// stream() <- 스트림 생성
// filter <- 중간 연산 , 연속 수행 가능
// count <- 최종 연산 , 마지막에 단 한번 사용 가능

// stream 의 특징
// 1. 데이터를 변경하지 않음
// 2. 1회용
// 3. 지연 연산 수행
// 4. 병렬 실행 가능

// stream 의 종류
// 1. Stream <T>   <- 범용 stream ( String, int 등등 )
// 2. IntStream  <- 값 타입이 Int 형
// 3. LongStream <- 값 타입이 Long
// 4. DoubleStream <- 값 타입이 Double

import java.util.stream.IntStream;

// 예제
public class main {
    public static void main(String[] args) {

        IntStream.range(0,10)
                .filter(i -> i % 2 == 0)
                .filter(i -> i % 4 == 0)
                .forEach(System.out::println);

        System.out.println();

        System.out.println(IntStream.range(0,10)
                .filter(i -> i % 2 == 0)
                .filter(i -> i % 4 == 0)
                .sum()
        );


    }
}
