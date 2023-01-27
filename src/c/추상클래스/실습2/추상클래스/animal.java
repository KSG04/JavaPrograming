package c.추상클래스.실습2.추상클래스;

public abstract class animal extends creature{

    public animal(int x, int y, int age){
        super(x, y, age);
    }

    @Override
    public void attack(){
        System.out.println("몸을 사용하여 공격!!");
    }


}
