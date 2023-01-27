package a.내부클래스와익명클래스;

public class main {

    public static void main(String[] args) {

        //내부 클래스는 코드가 난잡해질 수 있어서 주로 사용안함
        OuterClass out = new OuterClass();

        System.out.println("out.num : " + out.num);
        System.out.println("out.str1 : " + out.str1);
        System.out.println();

        OuterClass.InnerClass Inner = out.new InnerClass();
        System.out.println("Inner.num :" + Inner.num);
        System.out.println("Inner.str2 : " + Inner.str2);
        System.out.println();

        OuterClass.SinnerClass Sinner = out.new SinnerClass();
        System.out.println("Sinner.num :" + Sinner.num);
        System.out.println("Sinner.str3 :" + Sinner.str3);
        System.out.println();

        //OuterClass.SinnerClass Si = new OuterClass.SinnerClass();


        //익명 클래스는 주로 인터페이스나 추상클레스에 사용되는 방식
        new AnonymousClass(){
            @Override
            public void method(){
                System.out.println("AnonymousClass's Override method start");
            };
        }.method();
    }

}
