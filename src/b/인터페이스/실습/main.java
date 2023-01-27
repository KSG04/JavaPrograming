package b.인터페이스.실습;

public class main {
    public static void main(String[] args) {

        Toy robot = new ToyRobot();
        Toy airplane = new ToyAirplain();

        Toy toy[] = {robot,airplane};

        for (int i = 0; i < toy.length; i++){
            toy[i].walk();
            toy[i].run();
            toy[i].alarm();
            toy[i].light();
            System.out.println();
        }



    }
}
