package lessontwelve.inmemorrydb;

import java.util.*;

public class TestDbApp {

    public static void main(String[] args) {
        Student alex = new Student(1, "Alex", 35);
        Student oleg = new Student(2, "Oleg", 35);
        Student egor = new Student(3, "Egor", 35);
        Student max = new Student(4, "Max", 35);

        List<Student> students = Arrays.asList(alex, oleg, egor, max);
        int id = 3;
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Found " + student);
            }
        }

        InMemoryDatabase database = new InMemoryDatabase();
        students.forEach(student ->database.addStudent(student));
        Student student = database.getStudent(id);
        System.out.println("Found " + student);



//        Map<Integer, Student> map = new HashMap<>();
//        map.put(alex.getId(), alex);
//        map.put(oleg.getId(), oleg);
//        map.put(egor.getId(), egor);
//        map.put(max.getId(), max);
//
//        Student student = map.get(id);
//        System.out.println("Found" + student);


    }
}
