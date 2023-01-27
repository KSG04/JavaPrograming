package a.내부클래스와익명클래스;

public class OuterClass {
    int num = 10;
    String str1 = "Java";
    static String str11 = "Word";

    public OuterClass(){
        System.out.println("OuterClass constructor");
    }


    class InnerClass{
        int num = 20;
        String str2 = str1;

        public InnerClass(){
            System.out.println("InnerClass constructor");
        }
    }

    class SinnerClass{
        int num = 30;
        //static 클래스는 외부 클래스 멤버에 접근할 수 없다
        // String str3 = str1;
        String str3 = str11;

        public SinnerClass(){
            System.out.println("static SinnerClass constructor");
        }
    }
}
