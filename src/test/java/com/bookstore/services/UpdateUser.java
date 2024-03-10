package com.bookstore.services;

import com.bookstore.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

public class UpdateUser extends Globals {

    public void updateBook() {
        String email = "abc@gmail.com";
        String number = "636363";
        String name = "lalal";
        String bodytochange = "{\n" +
                        "  \"name\": \"" + name + "\",\n" +
                        "  \"email\": \"" + email + "\",\n" +
                        "  \"number\": \"" + number + "\"\n" +
                        "}";
               // """
              //  {
                //  "email": "abc@gmail.com",
                 // "number": "636363"
                //  }""";

        response = RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
        //        .header("Authorization", "Bearer " + token)
             //   .pathParam("/users/", )
                .and()
                .body(bodytochange)
                .when().log().all()
                .put("/users/"+userId+"")
                .prettyPeek();
    }

    public void validateThatBookIsUpdated() {
        //assert status code
        String email = "abc@gmail.com";
        String number = "636363";
        String name = "Aayan";
        Assert.assertEquals(200, response.statusCode());

        //validate userId and username
        Assert.assertEquals(email, response.path("email"));
        Assert.assertEquals(number, response.path("number"));

        //validate isbn number
      //  Assert.assertEquals(isbnNumbers.get(1), response.path("books[0].isbn"));
    }
}
