package f.콜렉션;
// 배열과 같이 자료 데이터를 효율적으로 관리하기 위해 사용


import java.util.ArrayList;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {

        //ArrayList 객체 생성 -> 인덱스를 이용해서 데이터 관리
        ArrayList<String> list = new ArrayList<String>();

        // 데이터 추가
        list.add("Hello");
        list.add("Java");
        list.add("World");
        System.out.println(list.size());


        System.out.println(list);

        System.out.println("데이터 추가");
        list.add(2,"programming");
        System.out.println(list);

        System.out.println();
        System.out.println("데이터 변경");
        list.set(1,"C");
        System.out.println(list);

        System.out.println();
        System.out.println("데이터 추출");
        //데이터 추출
        String str = list.get(2);
        System.out.println(str);
        System.out.println(list);

        System.out.println();

        System.out.println("데이터 제거");
        //데이터 제거
        str = list.remove(2);
        System.out.println(str);
        System.out.println(list);

        System.out.println();
        System.out.println("데이터 전체 제거");
        list.clear();
        System.out.println(list);

        System.out.println();
        System.out.println("데이터 유무");
        boolean b = list.isEmpty();
        System.out.println(b);

        System.out.println();
        System.out.println("map을 이용한 리스트");

        // Map
        // Map -> 인터페이스로 이를 구현한 클래스는 Key를 이용해서 데이터 관리
        // 특징
        // 1. key를 이용한다.
        // 2. key는 중복될 수 없지만 데이터는 중복 가능하다

        //Map 객체 생성
        HashMap<Integer,String> map = new HashMap<Integer,String >();

        //데이터 추가
        map.put(5,"Hello");
        map.put(6,"Java");
        map.put(7,"World");
        map.put(8,"!!");
        System.out.println(map);
        System.out.println("map 사이즈 :" + map.size());

        System.out.println();

        System.out.println("데이터 교체");
        map.put(6,"C");
        System.out.println(map);

        System.out.println();
        System.out.println("데이터 추출");
        str = map.get(5);
        System.out.println(str);
        System.out.println(map);

        System.out.println();

        System.out.println("데이터 제거");
        map.remove(8);
        System.out.println(map);

        System.out.println();

        System.out.println("특정 데이터 포함 유무");
        b = map.containsKey(7);
        System.out.println(map);
        System.out.println(b);

        System.out.println();

        System.out.println("데이터 전체 제거");
        map.clear();
        System.out.println(map);

        System.out.println();
        System.out.println("데이터 유무");
        b = map.isEmpty();
        System.out.println(map);
        System.out.println(b);

    }
}
