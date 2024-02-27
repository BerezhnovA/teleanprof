package lessonone;

public class TestPuppy {

    public static void main(String[] args) {
        Puppy smallPuppy = new Puppy();
        String nameSmallPuppy = smallPuppy.name;
        System.out.println("Name small puppy = " + nameSmallPuppy);
        smallPuppy.name = "Barbosik";
        System.out.println("Name small puppy = " + smallPuppy.name);


        Puppy middlePuppy = new Puppy();
        String nameMiddlePuppy = middlePuppy.name;
        System.out.println("Name middle puppy = " + nameMiddlePuppy);

        Dog bigDog = new Dog();

        Puppy bigPuppy;
        bigPuppy = new Puppy();
        String nameBigPuppy = bigPuppy.name;
        System.out.println("Name big puppy = " + nameBigPuppy);

        Puppy namedPuppy = new Puppy("Baget");
        String nameNamedPuppy = namedPuppy.name;
        System.out.println("Name named puppy = " + nameNamedPuppy);
        Puppy fullReadyPuppy = new Puppy("Charik", 1);
        System.out.println("Name full ready puppy = " + fullReadyPuppy.name);
        System.out.println("Age full ready puppy = " + fullReadyPuppy.age);

    }
}
