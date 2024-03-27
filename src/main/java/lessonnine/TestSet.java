package lessonnine;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSet {

    public static void main(String[] args) {
        SortedSet<String> stringSet = new TreeSet<>();
        stringSet.add("B");
        stringSet.add("C");
        stringSet.add("A");
        stringSet.add("B");

        System.out.println(stringSet);
        System.out.println(stringSet.first());
        System.out.println(stringSet.last());

        Iterator<String> iterator =stringSet.iterator();
        while (iterator.hasNext())
            System.out.print(" " + iterator.next());


    }
}
