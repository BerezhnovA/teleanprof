package lessonthree.exempleabstract;

public class Cow extends HomeAnimal {


    public Cow(String name) {
        super(name);
    }

    @Override
    void humanCare() {
        //
    }

    public void produceMilk() {
        //
    }


    @Override
    public void born() {
        System.out.println("Cow is born!");
    }
}
