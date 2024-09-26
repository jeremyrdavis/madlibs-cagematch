package io.arrogantprogrammer.sillystories;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

@QuarkusTest
public class SillyStoryApiTest {

    @Test
    public void testGetSillyStory() {
        given()
                .when().with().contentType("application/json")
                .get("/sillystories/play")
                .then()
                .statusCode(200)
                .body("replacementWords", notNullValue())
                .body("storyId", notNullValue());
    }


}
