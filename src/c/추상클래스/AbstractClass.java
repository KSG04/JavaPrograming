package c.추상클래스;

public abstract class AbstractClass {
    int num;
    String  str;

    public AbstractClass(){
        System.out.println("AbstractClass constructor1");
    }
    public AbstractClass(int a, String b){
        System.out.println("AbstractClass constructor2");
    num = a;
    str = b;
    }

    public void fun1(){
        System.out.println(" -- fun1 start --");
    }

    public abstract void fun2();

}
