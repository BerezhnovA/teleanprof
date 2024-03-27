package lessoneight;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

    public static void main(String[] args) {
        List<String> listOne= new ArrayList<>();
        listOne.add("One");
        listOne.add("Two");
        listOne.add("Three");
        System.out.println(listOne.get(1));

        List<String> listTwo= new LinkedList<>();
        listOne.add("One");
        listOne.add("Two");
        listOne.add("Three");
        System.out.println(listOne.get(2));

        listOne.add(0,"Four");
        listTwo.add(0,"Four");



    }
}
