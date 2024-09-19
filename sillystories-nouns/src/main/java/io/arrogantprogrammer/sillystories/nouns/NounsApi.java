package io.arrogantprogrammer.sillystories.nouns;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Path("/nouns")
public class NounsApi {

    @GET
    public String randomNoun() {
        return nouns.get(new Random().nextInt(nouns.size()));
    }

    private List<String> nouns = new ArrayList(){{
        add("aunt");
        add("bear");
        add("bird");
        add("carrot");
        add("cat");
        add("cheese");
        add("child");
        add("city");
        add("daffodil");
        add("doctor");
        add("dog");
        add("garage");
        add("garden");
        add("gargoyle");
        add("horse");
        add("kangaroo");
        add("koala");
        add("lightbulb");
        add("lion");
        add("man");
        add("mouse");
        add("onion");
        add("panda");
        add("park");
        add("pencil");
        add("radish");
        add("road");
        add("rock");
        add("salamander");
        add("station");
        add("student");
        add("teacher");
        add("tomato");
        add("uncle");
        add("vampire");
        add("village");
        add("wallaby");
        add("woman");
    }};
}
