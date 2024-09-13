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
    public void testGetRandomMadlib() {
        MadlibVO madlibVO = sillyStoryService.randomMadlib();
        assertNotNull(madlibVO);
        assertEquals(7, madlibVO.replacementMap().size());
    }
}
