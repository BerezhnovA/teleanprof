package lessonthree.exampleinterface;

public class Bird implements Flyable, AbleToEat {
    @Override
    public void fly() {
        System.out.println("Bird fly");
    }

    @Override
    public void eat() {
        System.out.println("Bird fly!");
    }


}
