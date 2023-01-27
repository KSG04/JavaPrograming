package c.추상클래스;

public class Classex extends AbstractClass{
    public Classex(){
        System.out.println("Classex constructor");
    }
    public Classex(int a, String b){
        super(a,b);
    }

    @Override
    public void fun2(){
        System.out.println(" -- fun2() start -- ");
    }

}
