package io.arrogantprogrammer.madlibs;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@ApplicationScoped
public class MadlibsService {

    List<Madlib> madlibs = new ArrayList<>(){{
        add(new Madlib("""
            There once was a princess who lived in a %01% in a great wood.  She had a pet %02% named %03% who followed her everywhere she went.
            One day she took a walk in the %04% and met a %05% who offered her magical %06%.  The %06% would turn anything she wanted into a %07%.
            """,
            new HashMap<>(){{
                put(1, "Noun");
                put(2, "Noun");
                put(3, "Name");
                put(4, "Verb");
                put(5, "Noun");
                put(6, "Noun");
                put(7, "Noun");
            }}));
        }};

    MadlibVO randomMadlib() {
        return new MadlibVO(madlibs.get(0).orignalText, madlibs.get(0).replacementMap);
    }

    MadlibVO getMadlib(int index) {
        return new MadlibVO(madlibs.get(index).orignalText, madlibs.get(index).replacementMap);
    }
}
