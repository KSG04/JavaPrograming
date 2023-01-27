package c.추상클래스.실습2.추상클래스;

import c.추상클래스.실습2.인터페이스.Talkable;

public abstract class human  extends creature implements Talkable {

    public human(int x,int y,int age){
        super(x,y,age);
    }

    @Override
    public void attack(){
        System.out.println("도구를 사용하여 공격!!");
    }

    @Override
    public void talk(){
        System.out.println("사람은 말을 할 수 있다!!");
    }

}
