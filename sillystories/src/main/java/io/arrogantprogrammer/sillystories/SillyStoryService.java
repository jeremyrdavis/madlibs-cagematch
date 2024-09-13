package io.arrogantprogrammer.sillystories;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@ApplicationScoped
public class SillyStoryService {

    List<SillyStory> sillyStories = new ArrayList<>(){{
        add(new SillyStory("""
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
        return new MadlibVO(sillyStories.get(0).orignalText, sillyStories.get(0).replacementMap);
    }

    MadlibVO getMadlib(int index) {
        return new MadlibVO(sillyStories.get(index).orignalText, sillyStories.get(index).replacementMap);
    }
}
