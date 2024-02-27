package lessonthree.exempleabstract;

public abstract class HomeAnimal extends Animal{
    public HomeAnimal(String name) {
        super(name);
    }

    abstract void humanCare();
}
