package lessonfour.exampleenum;

public class DescriptionDay {

    public static void main(String[] args) {
        DescriptionDay descriptionDay = new DescriptionDay();
        descriptionDay.dayIsNice(Day.SUNDAY);

    }
    public void dayIsNice (Day day){
        switch (day){
            case MONDAY:
                System.out.println("bad day");
                break;
            case FRIDAY:
                System.out.println("Better day");
                break;
            case SUNDAY:
            case SATURDAY:
                System.out.println("Best day");
                break;
            default:
                System.out.println("so-so");
        }
    }
}
