package g.예외처리;

// 프로그램에 문제가 발생했을 때 시스템 동작에 문제가 없도록 사전에 예방하는 코드를 작성하는 방법
// 1. Exception 클래스
// 2. try ~ catch
// 3. 다양한 예외처리 방법
// 4. finally
// 5. throws

public class main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;

        System.out.println("Exception before");

        try {
            c = a / b ;
        }catch (Exception e ){
            e.printStackTrace();
            String msg = e.getMessage();
            System.out.println("msg : " + msg);
        }
        System.out.println("Exception after");





    }
}
