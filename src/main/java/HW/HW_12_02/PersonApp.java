package HW.HW_12_02;

public class PersonApp {

    public static void main(String[] args) {

        Person person = new Person();

        person.setName("Anton");
        person.setFullName("Antonio");
        person.setAge(33);

        person.move();
        person.talk();

        Person person1 = new Person("Kolya", "Nikolay", 38);

        person1.move();
        person1.talk();
    }
}
