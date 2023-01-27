package c.추상클래스.실습2.일반클래스;

import c.추상클래스.실습2.인터페이스.programmer;
import c.추상클래스.실습2.인터페이스.SwimAble;
import c.추상클래스.실습2.추상클래스.human;

public class Kevin extends human implements programmer, SwimAble {

    public Kevin(int x, int y, int age){
        super(x,y,age);
    }
    @Override
    public void coding(){
        System.out.println("Hello world!!");
    }

    @Override
    public void swimDown(int yDistance){
        setY(getY() - yDistance);
        if (getY() < -10) {
            System.out.println("너무 깊이 들어가면 죽을 수 있어 !!");
        }
    }

    @Override
    public void printinfo(){
        System.out.println("Kevin -->" + toString());
    }

}
