package lessonnine;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;


public class TestExempleFive {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();

        stringSet.add("B");
        stringSet.add("C");
        stringSet.add("A");
        stringSet.add("B");
        stringSet.add("Hallo");
        stringSet.add("World");
        stringSet.add("World");

        System.out.println(stringSet);

    }
}
