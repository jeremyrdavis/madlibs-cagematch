package io.arrogantprogrammer.madlibs;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class MadlibsService {

    List<Madlib> madlibs;

    Madlib randomMadlib() {
        return madlibs.get(0);
    }
}
