package c.추상클래스.실습2;

import c.추상클래스.실습2.일반클래스.Kevin;
import c.추상클래스.실습2.일반클래스.Pigeon;
import c.추상클래스.실습2.일반클래스.Turtle;

public class main {

    public static void main(String[] args) {
        Kevin kevin = new Kevin(0,0,10);
        Pigeon pigeon = new Pigeon(0,0,10);
        Turtle turtle = new Turtle(0,0,10);

        kevin.printinfo();
        kevin.coding();
        kevin.swimDown(50);
        kevin.printinfo();
        kevin.attack();
        kevin.move(50);
        kevin.printinfo();
        kevin.getAge();
        kevin.talk();
        kevin.printinfo();

        System.out.println();


        pigeon.printinfo();
        pigeon.age(20);
        pigeon.fly(10);
        pigeon.flyMove(30,50);
        pigeon.printinfo();
        pigeon.attack();

    }



}
