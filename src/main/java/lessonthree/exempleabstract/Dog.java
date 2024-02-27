package lessonthree.exempleabstract;

public class Dog extends HomeAnimal {


    public Dog(String name) {
        super(name);
    }

    @Override
    void humanCare() {
        //
    }

    @Override
    public void born() {
        System.out.println("Dog is born!");
    }
}

