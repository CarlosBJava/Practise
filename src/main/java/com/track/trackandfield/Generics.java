package com.track.trackandfield;

import java.util.List;

// Java 5
public class Generics {

    // Nadelen van generics? hint = type erasure

    List<Integer> list = List.of(123, 456);
    List<String> stringList = List.of("");
    List<Boolean> boolList = List.of(true, false);

    Person<Boolean> person = new Person<>("carlos", 35, Boolean.TRUE);
    Person<String> personStringGendered = new Person<>("sander", 29, "komt later");

}

class Person<T> {
    private final String name;
    private final Integer age;
    private final T gender;

    public Person(String name, Integer age, T gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public T getGender() {
        return gender;
    }
}
