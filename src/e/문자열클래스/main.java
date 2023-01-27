package e.문자열클래스;

//String a = a + " Hi " 할 경우  문자열이 변경되면 기존의 객체를 버리고 새로운 객체에 메모리를 생성한다.
// 이때 기존 객체는 GC에 의해서 메모리 회수가 일어나지만 메모리상의 변화가 많아 약간의 속도가 느려진다
// 이를 개선하고자 StringBuffer, StringBuilder 가 만들어졌다.
// 둘이 기능은 똑같고, StringBuffer 는 데이터 안정성이 좋고(메모리에 데이터가 들어가고 빠지고 할때 순차적으로 데이터를 넣기 떄문에 데이터가 유실되지 않음) StringBuilder 는 속도가 더 빠르다

public class main {
    public static void main(String[] args) {

        String str = "Java";
        System.out.println("str : " + str);

        str = str + "_ 8";
        System.out.println("str : " + str);

        //StringBuffer
        StringBuffer sf = new StringBuffer("JaVa");
        System.out.println("sf : " + sf);
        sf.append("World");
        System.out.println("sf : " + sf);
        System.out.println("sf.leanth() : " + sf.length());

        sf.insert(sf.length(),"~~~~"); //문자열의 끝에 추가하겠다.
        System.out.println("sf : " + sf);

        sf.insert(1,"~~"); // 문자열의 첫번째에 추가
        System.out.println("sf : " + sf);

        sf.delete(1,3);
        System.out.println("sf : " + sf);

        System.out.println();
        //StringBuilder

        StringBuilder sb = new StringBuilder("Java World");
        System.out.println("sb : " + sb);


    }
}
