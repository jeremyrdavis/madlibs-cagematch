package io.arrogantprogrammer.sillystories;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SillyStoryTest {

    @Test
    public void testJson() {

        SillyStory sillyStory = new SillyStory(1L,"There once was a %01%", List.of(new ReplacementNeeded(1, WordType.NOUN)));
        assertEquals(1, sillyStory.getNumberOfNouns());

        sillyStory.build(List.of(new ReplacementWord(1, "cat")));
        assertEquals("There once was a cat", sillyStory.getUpdatedStory());
    }

}
