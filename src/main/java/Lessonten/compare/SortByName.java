package Lessonten.compare;

import java.util.Comparator;

public class SortByName implements Comparator<Car> {


    @Override
    public int compare(Car o1, Car o2) {
        return o1.getName().compareTo(o2.getName());

    }
}
