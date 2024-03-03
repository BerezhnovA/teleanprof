package HW.HW_12_02;

public class PhoneApp {

    public static void main(String[] args) {

        Phone phone1 = new Phone("Xiaomi", 7888888, 0.18);
        Phone phone2 = new Phone("Motorola", 79999999, 0.195);
        Phone phone3 = new Phone("iPhone", 7777777, 0.1987);

        System.out.println("Model " + phone1.getModel() + ", number: " + phone1.getNumber() + ", weight: " + phone1.getWeight() + "/lb");
        System.out.println("Model " + phone2.getModel() + ", number: " + phone2.getNumber() + ", weight: " + phone2.getWeight() + "/lb");
        System.out.println("Model " + phone3.getModel() + ", number: " + phone3.getNumber() + ", weight: " + phone3.getWeight() + "/lb");

        System.out.println(phone1.receiveCall("Владимир Владимирович") + phone1.getNumber());
        System.out.println(phone1.receiveCall("Дмитрий Анатольевич") + phone2.getNumber());
        System.out.println(phone1.receiveCall("Илон Маск") + phone3.getNumber());
    }
}