package io.arrogantprogrammer.sillystories;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class SillyStoryService {

    Map<Long, SillyStory> sillyStories = new HashMap<>(){{
        put(1L, new SillyStory(1L,
            """
            There once was a princess who lived in a %01% in a great wood.  She had a pet %02% named %03% who followed her everywhere she went.
            One day she took a walk in the %04% and met a %05% who offered her magical %06%.  The %06% would turn anything she wanted into a %07%.
            """,
            new ArrayList<>(){{
                add(new ReplacementWordType(1, WordType.NOUN));
                add(new ReplacementWordType(2, WordType.NOUN));
                add(new ReplacementWordType(3, WordType.NAME));
                add(new ReplacementWordType(4, WordType.VERB));
                add(new ReplacementWordType(5, WordType.NOUN));
                add(new ReplacementWordType(6, WordType.NOUN));
                add(new ReplacementWordType(7, WordType.NOUN));
            }}));
        }};

    SillyStoryVO randomSillyStory() {
        return new SillyStoryVO(sillyStories.get(1L).id, sillyStories.get(1L).replacementWordTypes);
    }

    public StoryRequirements randomSillyStoryRequirements() {
        SillyStory sillyStory = sillyStories.get(1L);
        return new StoryRequirements(sillyStory.id, sillyStory.replacementWordTypes);
    }
}
