package b.인터페이스.실습;

public class ToyRobot implements Toy{

    @Override
    public void walk() {
        System.out.println("The Robot has walk function!");
    }

    @Override
    public void run() {
        System.out.println("The Robot has run function!");
    }

    @Override
    public void alarm() {
        System.out.println("The Robot has no alarm function");
    }

    @Override
    public void light() {
        System.out.println("The Robot has no light function");
    }
}
