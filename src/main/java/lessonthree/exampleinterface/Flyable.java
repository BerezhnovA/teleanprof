package lessonthree.exampleinterface;

public interface Flyable {
    //public abstract -нет смысла писать interface-это абсолютно абстрактный класс
    String FLY_NAME = "Name";

    void fly();

    default void prepareFly() {
        System.out.println("Prepare to fly");
    }
}
