package lessonthree.exempleabstract;

public class Horse extends WildAnimal {


    public Horse(String name) {
        super(name);
    }

    public void jump() {
        //
    }

    @Override
    public void born() {
        System.out.println("Horse  is born!");
    }
}
