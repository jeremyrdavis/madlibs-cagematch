package io.arrogantprogrammer.sillystories;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class SillyStoryService {

    Map<Long, SillyStory> sillyStories = new HashMap<>(){{
        put(1L, new SillyStory(1L,
            """
            There once was a princess who lived in a %01% in a great wood.  She had a pet %02% named %03% who followed her everywhere she went.
            One day she took a walk in the %04% and met a %05% who offered her magical %06%.  The %06% would turn anything she wanted into a %07%.
            """,
            new HashMap<>(){{
                put(1, Replacement.NOUN);
                put(2, Replacement.NOUN);
                put(3, Replacement.NAME);

                put(4, Replacement.VERB);
                put(5, Replacement.NOUN);
                put(6, Replacement.NOUN);
                put(7, Replacement.NOUN);
            }}));
        }};

    SillyStoryVO randomSillyStory() {
        return new SillyStoryVO(sillyStories.get(0).originalText, sillyStories.get(0).replacementMap);
    }

    SillyStoryVO getSillyStory(int id) {
        return new SillyStoryVO(sillyStories.get(id).originalText, sillyStories.get(id).replacementMap);
    }

    SillyStoryVO randomValues(Long id) {
        SillyStory sillyStory = sillyStories.get(id);
        sillyStory.replacementMap.values().forEach(v -> {

        });
    }
}
