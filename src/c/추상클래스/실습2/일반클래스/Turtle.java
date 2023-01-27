package c.추상클래스.실습2.일반클래스;

import c.추상클래스.실습2.인터페이스.SwimAble;
import c.추상클래스.실습2.추상클래스.animal;

public class Turtle extends animal implements SwimAble {

    public Turtle(int x, int y, int age){
        super(x, y, age);
    }

    public void printinfo(){
        System.out.println("Turtle -->" +  toString());
    }
    public void swimDown(int yDistance){
        setY(getY() - yDistance);
    }

}
