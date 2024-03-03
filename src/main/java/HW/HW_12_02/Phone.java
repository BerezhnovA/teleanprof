package HW.HW_12_02;

public class Phone {

    private int number;
    private String model;
    private double weight;

    public Phone(String model, int number, double weight) {

        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public String receiveCall(String name) {
        return name + " Звонит ";
    }
}