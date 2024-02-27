package lessonthree.exempleabstract;

public class ExampleAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog("Sharik");
        Cow cow = new Cow("Mu");
        Cow mashka = new Cow("Mashka");
        System.out.println(cow.getName());
        System.out.println(mashka.getName());
        System.exit(0);
        Horse horse = new Horse("Brodyaga");

        // new Animal();- создать объект на основании абстрактного класса нельзя

        dog.eat();
        cow.eat();
        cow.produceMilk();
        horse.eat();
        horse.jump();

        Animal[] animals = {dog,cow,horse};
        for (Animal animal : animals) {
            animal.eat();
        }


    }
}
