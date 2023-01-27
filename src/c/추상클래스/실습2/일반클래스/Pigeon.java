package c.추상클래스.실습2.일반클래스;

import c.추상클래스.실습2.인터페이스.FlyAble;
import c.추상클래스.실습2.추상클래스.animal;

public class Pigeon extends animal implements FlyAble {

    public Pigeon(int x, int y, int age){
        super(x, y, age);
    }

    @Override
    public void printinfo(){
        System.out.println("Pigeon -->" + toString());
    }

    @Override
    public void fly(int yDistance){
        setY(getY() + yDistance);
    }
    @Override
    public void flyMove( int xDistance,int yDistance){
        setX(getX() + xDistance);
        setY(getY() + yDistance);
    }

}
