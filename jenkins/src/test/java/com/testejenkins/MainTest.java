package com.testejenkins;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class MainTest {
    
    @Test
    public void testBase() {
        given()
        .when()
            .get("https://api.github.com/users/octocat")
        .then()
            .statusCode(200)
            .body("login", equalTo("octocat"));    
    }
}
