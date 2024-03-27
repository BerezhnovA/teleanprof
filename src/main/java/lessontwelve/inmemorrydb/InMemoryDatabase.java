package lessontwelve.inmemorrydb;

import java.util.HashMap;
import java.util.Map;

public class InMemoryDatabase {


    private Map<Integer, Student> map = new HashMap<>();

    public void addStudent(Student student) {
        map.put(student.getId(), student);


    }

    public Student getStudent(int id) {
        if (!map.containsKey(id)) {
            System.out.println("Incorret ID" + id);
        }
        return map.get(id);
    }

    public void deleteStudent(int id) {

        map.remove(id);
    }


}
