package com.example.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class GetTest {

    @Test
    public void testGetMethod() {
        RestAssured.baseURI = "https://postman-echo.com";

        Response response = RestAssured.given()
                .queryParam("foo", "bar")
                .when()
                .get("/get")
                .then()
                .extract().response();

        assertThat(response.getStatusCode(), equalTo(200));

        assertThat(response.jsonPath().getString("args.foo"), equalTo("bar"));
    }
}