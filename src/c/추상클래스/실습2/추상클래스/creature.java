package c.추상클래스.실습2.추상클래스;

public abstract class creature {
    private int x ;
    private int y ;
    private int age ;

    public creature(int x, int y, int age){
        this.x = x;
        this.y = y;
        this.age = age;
    }

    public void move(int x){
        this.x += x;
    }
    public void age(int age){
        this.age += age;
    }

    public abstract void attack();
    public abstract void printinfo();


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "x=" + x +
                ", y=" + y +
                ", age=" + age;
    }
}
