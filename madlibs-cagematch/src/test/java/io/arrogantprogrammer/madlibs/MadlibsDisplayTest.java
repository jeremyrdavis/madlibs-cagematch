package io.arrogantprogrammer.madlibs;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
public class MadlibsDisplayTest {

    @Inject
    MadlibsService madlibsService;

    @Test
    public void testDisplay() {
        MadlibVO madlibVO = madlibsService.getMadlib(0);
        assertNotNull(madlibVO);
        assertEquals(7, madlibVO.replacementMap().size());
        assertEquals("Name", madlibVO.replacementMap().get(3));
    }
}
