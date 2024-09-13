package io.arrogantprogrammer.madlibs;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
public class MadlibsServiceTest {

    @Inject
    MadlibsService madlibsService;

    @Test
    public void testGetRandomMadlib() {
        Madlib madlib = madlibsService.randomMadlib();
        assertNotNull(madlib);
    }
}
