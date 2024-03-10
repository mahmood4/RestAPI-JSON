package com.bookstore.services;

import com.bookstore.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

public class PostNewUser extends Globals {

    public void postNewUser() {

        String body = """
                {
                  "name": "Syed",
                  "email": "abc@gmail.com",
                  "number": "636363"
                  }""";

        response = RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .and()
            //    .header("Authorization", "Bearer " + token)
                .body(body)
                .when().log().all()
                .post("/users")
                .prettyPeek();
    }

    public void validateThatUserIsCreated() {
        //assert status code
        Assert.assertEquals(201, response.statusCode());
        int test;
        //get userId from body
      //  userId = response.path("userID");
        test =response.jsonPath().get("id");
        System.out.println(test);
        userId = String.valueOf(test);
       // userId = String.valueOf(response.jsonPath().get("id"));
        //validate that isbn number is correct
        String actualIsbn = response.jsonPath().get("name");
        Assert.assertEquals("Syed", actualIsbn);
    }
}
