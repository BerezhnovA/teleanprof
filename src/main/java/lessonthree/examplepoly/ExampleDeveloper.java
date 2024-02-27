package lessonthree.examplepoly;

public class ExampleDeveloper {
    public static void main(String[] args) {
        Developer developer = new Developer();
        Developer softwareDeveloper = new BackendDeveloper();
        Developer frontendDeveloper = new FrontendDeveloper();
        Developer dbDeloper = new DatabaseDeveloper();

//        developer.writeTheCode();
//        softwareDeveloper.writeTheCode();
//        frontendDeveloper.writeTheCode();
//        dbDeloper.writeTheCode();

        askDevToWriteCode(developer);
        askDevToWriteCode(softwareDeveloper);
        askDevToWriteCode(frontendDeveloper);

    }
    private static void askDevToWriteCode (Developer developer){
        developer.writeTheCode();
    }
}
