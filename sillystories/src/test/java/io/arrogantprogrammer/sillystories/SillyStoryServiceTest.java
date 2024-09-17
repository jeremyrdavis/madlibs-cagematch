package io.arrogantprogrammer.sillystories;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
public class SillyStoryServiceTest {

    @Inject
    SillyStoryService sillyStoryService;

    @Test
    public void testGetRandomSillyStory() {
        SillyStoryVO sillyStoryVO = sillyStoryService.randomSillyStory();
        assertNotNull(sillyStoryVO);
        assertEquals(7, sillyStoryVO.replacementMap().size());
    }
}
