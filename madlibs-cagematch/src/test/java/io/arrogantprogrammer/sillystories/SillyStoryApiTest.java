package io.arrogantprogrammer.sillystories;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class SillyStoryApiTest {

    @Test
    public void testGetMadlib() {
        given()
                .when().with().contentType("application/json")
                .get("/madlibs/play")
                .then()
                .statusCode(200)
                .body(containsString("id"));

    }
}
