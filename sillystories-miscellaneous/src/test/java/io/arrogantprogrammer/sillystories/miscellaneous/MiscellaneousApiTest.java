package io.arrogantprogrammer.sillystories.miscellaneous;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class MiscellaneousApiTest {

    @Test
    void testWomansName() {
        given()
                .when().get("/miscellaneous/name/female")
                .then()
                .statusCode(200)
                .body(is("Hello from Quarkus REST"));
    }

}
