package g.예외처리.throws연습;

// 예외 발생 시 예외 처리를 직접하지 않고 나를 호출한 곳으로 넘긴다.


public class main {
    public static void main(String[] args) {
        main main = new main();
        try {
            main.first();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void first() throws Exception{
        second();
    }
    public void second() throws Exception {
        third();
    }
    public void  third() throws  Exception {
        System.out.println(" 10 / 0 = " + (10 / 0));
    }
}
