package com.track.trackandfield;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// Java 8
public class Streams {

    public void myFunction2() {

        // Function 1 input, 1 output
        Function<Integer, String> function = integer -> integer.toString() + " FunctionalInterfacesAreCool";

        // Runnable 0 input, 0 output
        Runnable runnable = () -> System.out.println("Ran!");

        // Producer 0 input, 1 output
        Supplier<String> producer = () -> "Produced!";

        // Consumer 1 input, 0 output
        Consumer<String> consumer = string -> System.out.println(string);

        // Predicate 1 input, boolean output
        Predicate<String> predicate = string -> string.isEmpty();

        var list = List.of("123", "456");

        var result = list.stream()
                .filter(item -> !item.equals("123"))
                .map(item -> item + " gemapped")
                .toList();

    }

    private void doSomething(MyLambda function) {
        function.myFunction(123);
    }

}

@FunctionalInterface
interface MyLambda {
    String myFunction(Integer number);
}