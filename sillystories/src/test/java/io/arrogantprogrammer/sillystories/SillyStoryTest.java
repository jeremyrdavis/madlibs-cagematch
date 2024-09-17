package io.arrogantprogrammer.sillystories;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
public class SillyStoryTest {

    @Inject
    SillyStoryService sillyStoryService;

    @Test
    public void testDisplay() {
        SillyStoryVO sillyStoryVO = sillyStoryService.getSillyStory(0);
        assertNotNull(sillyStoryVO);
        assertEquals(7, sillyStoryVO.replacementMap().size());
        assertEquals("Name", sillyStoryVO.replacementMap().get(3));
    }
}
