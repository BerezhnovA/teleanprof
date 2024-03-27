package Lessonten;

import java.util.Objects;

public class Cat {

    private String name;

    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    //    public boolean equals(Object obj) {
//        //1
//        if (this == obj) return true;
//        //2
//        if (obj == null) return false;
//        //3
//        if (!(obj instanceof Cat)) return false;
//        //4
//        Cat cat = (Cat) obj;
//
//        if(this.age != cat.age) return false;
//
//        if (this.name == null) return cat.name == null;
//
//        return this.name.equals(cat.name);
//    }

}