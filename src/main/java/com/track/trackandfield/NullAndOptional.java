package com.track.trackandfield;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Optional;

// Java 8
public class NullAndOptional {

    public void doThis() {
        var berekening = "123";

        var result = function(berekening)
            .flatMap(item -> functionTwo(berekening));

        var blaat = function(null);

        System.out.println(result);
    }

    // JSR-305 annotations
    private Optional<String> function(@NonNull String param) {
        return Optional.of("success!");
    }

    private Optional<String> functionTwo(@Nullable String param) {
        return Optional.empty();
    }
}
