package com.example.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PutTest {

    @Test
    public void testPutMethod() {
        RestAssured.baseURI = "https://postman-echo.com";

        Response response = RestAssured.given()
                .contentType("application/json")
                .body("{\"foo\":\"bar\"}")
                .when()
                .put("/put")
                .then()
                .extract().response();

        assertThat(response.getStatusCode(), equalTo(200));

        assertThat(response.jsonPath().getString("data.foo"), equalTo("bar"));
    }
}