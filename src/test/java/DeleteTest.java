package com.example.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DeleteTest {

    @Test
    public void testDeleteMethod() {

        RestAssured.baseURI = "https://postman-echo.com";

        Response response = RestAssured.given()
                .when()
                .delete("/delete")
                .then()
                .extract().response();

        assertThat(response.getStatusCode(), equalTo(200));

        assertThat(response.jsonPath().getString("data"), equalTo("[:]"));
    }
}